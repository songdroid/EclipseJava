import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectTest {
	public static void main(String[] args) {
		// TODO DB연결 테스트
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "1111");
			
			if(con != null)
				System.out.println("연결 성공");
			else
				System.out.println("연결 실패");
		}
		catch(Exception err){
			System.out.println("연결 실패 : " + err);
		}
	}
}
