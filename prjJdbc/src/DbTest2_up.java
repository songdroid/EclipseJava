import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DbTest2_up {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			con = DriverManager.getConnection(url, "scott", "1111");
			
			/*
			 * 급여, 부서, 업무를 입력받아 검색한다.
			 * 이때 급여는 같거나 크고, 부서와 업무가 같은 직원의
			 * 사번, 이름, 업무, 부서번호, 급여, 입사일자 조회
			 */
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("급여 : ");
			int sal = scan.nextInt();
			
			System.out.print("부서 : ");
			int deptno = scan.nextInt();
			
			System.out.print("업무 : ");
			String job = scan.next();
			
			String sql = "SELECT empno, ename, sal, job, deptno, " +
					"hiredate FROM EMP WHERE sal>=? AND deptno=? AND lower(job)=lower(?)";
			stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, sal);
			stmt.setInt(2, deptno);
			stmt.setString(3, job);
			
			rs = stmt.executeQuery();
			
			System.out.println("************검색 결과************");
			while(rs.next()){
				System.out.println("사번 : " + rs.getInt("empno"));
				System.out.println("이름 : " + rs.getString("ename"));
				System.out.println("급여 : " + rs.getInt("sal"));
				System.out.println("업무 : " + rs.getString("job"));
				System.out.println("부서 : " + rs.getInt("deptno"));
				System.out.println("입사일자 : " + rs.getString("hiredate"));
				System.out.println();
			}
			/*
			 * 업무명은 대소문자 구별없이 입력받을 수 있게 한다
			 * 부서코드대신 부서명이 나올 수 있게 한다.
			 */
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
