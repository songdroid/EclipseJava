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
			 * �޿�, �μ�, ������ �Է¹޾� �˻��Ѵ�.
			 * �̶� �޿��� ���ų� ũ��, �μ��� ������ ���� ������
			 * ���, �̸�, ����, �μ���ȣ, �޿�, �Ի����� ��ȸ
			 */
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("�޿� : ");
			int sal = scan.nextInt();
			
			System.out.print("�μ� : ");
			int deptno = scan.nextInt();
			
			System.out.print("���� : ");
			String job = scan.next();
			
			String sql = "SELECT empno, ename, sal, job, deptno, " +
					"hiredate FROM EMP WHERE sal>=? AND deptno=? AND lower(job)=lower(?)";
			stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, sal);
			stmt.setInt(2, deptno);
			stmt.setString(3, job);
			
			rs = stmt.executeQuery();
			
			System.out.println("************�˻� ���************");
			while(rs.next()){
				System.out.println("��� : " + rs.getInt("empno"));
				System.out.println("�̸� : " + rs.getString("ename"));
				System.out.println("�޿� : " + rs.getInt("sal"));
				System.out.println("���� : " + rs.getString("job"));
				System.out.println("�μ� : " + rs.getInt("deptno"));
				System.out.println("�Ի����� : " + rs.getString("hiredate"));
				System.out.println();
			}
			/*
			 * �������� ��ҹ��� �������� �Է¹��� �� �ְ� �Ѵ�
			 * �μ��ڵ��� �μ����� ���� �� �ְ� �Ѵ�.
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
