import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DbTest3 {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			con = DriverManager.getConnection(url, "scott", "1111");
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("사번 : ");
			int empno = scan.nextInt();
			
			System.out.print("이름 : ");
			String ename = scan.next();
			
			System.out.print("급여 : ");
			int sal = scan.nextInt();
			
			///////// 기존 사원번호 중복검사 ////////////////
			String sql = "select empno from emp";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				if(empno == rs.getInt("empno")){
					System.out.println("이미 있는 사원번호 입니다.");
					return;
				}
			}
			
			////////////// 사원정보 입력 /////////////////////////
			sql="insert into emp(empno, ename, sal) values(" +
				empno + ", '" + ename + "', " + sal + ")";
			//System.out.println(sql);
			
			int result = stmt.executeUpdate(sql);
			if(result > 0)
				System.out.println("잘 입력되었습니다.");
			else
				System.out.println("입력되지 않았습니다.");
			
			//////// 입력된 결과 출력 /////////////////////////////
			sql = "select empno, ename, sal from emp";
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getInt(1) + "\t" + 
					rs.getString(2) + "\t" + rs.getInt(3));
			}
		}
		catch(Exception err){
			err.printStackTrace();
		}
		finally{
			if(rs != null){	try{ rs.close();} catch(Exception err){} }
			if(stmt != null){ try{ stmt.close(); } catch(Exception err){} }
			if(con != null){ try{ con.close(); } catch(Exception err){} }
		}
	}
}
