import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DbTest3_up {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			con = DriverManager.getConnection(url, "scott", "1111");
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("��� : ");
			int empno = scan.nextInt();
			
			System.out.print("�̸� : ");
			String ename = scan.next();
			
			System.out.print("�޿� : ");
			int sal = scan.nextInt();
			
			///////// ���� �����ȣ �ߺ��˻� ////////////////
			String sql = "select empno from emp";
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				if(empno == rs.getInt("empno")){
					System.out.println("�̹� �ִ� �����ȣ �Դϴ�.");
					return;
				}
			}
			
			////////////// ������� �Է� /////////////////////////
			sql="insert into emp(empno, ename, sal) values(?,?,?)";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, empno);
			stmt.setString(2, ename);
			stmt.setInt(3, sal);
			
			int result = stmt.executeUpdate();
			if(result > 0)
				System.out.println("�� �ԷµǾ����ϴ�.");
			else
				System.out.println("�Էµ��� �ʾҽ��ϴ�.");
			
			//////// �Էµ� ��� ��� /////////////////////////////
			sql = "select empno, ename, sal from emp";
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
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
