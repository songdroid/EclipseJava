import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectTest {
	public static void main(String[] args) {
		// TODO DB���� �׽�Ʈ
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "1111");
			
			if(con != null)
				System.out.println("���� ����");
			else
				System.out.println("���� ����");
		}
		catch(Exception err){
			System.out.println("���� ���� : " + err);
		}
	}
}
