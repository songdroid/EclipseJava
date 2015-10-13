import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DbTest2 {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
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
					"hiredate FROM EMP WHERE sal>=" + sal + " AND " +
					"deptno=" + deptno + " AND lower(job)=lower('" + job + "')";
			
			//System.out.println(sql);
			
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
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
