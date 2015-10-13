import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbTest1 {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			con = DriverManager.getConnection(url, "scott", "1111");
			
			String sql = "select empno, ename, job, sal from emp";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			/*
			rs.next();
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
			
			rs.next();
			System.out.println(rs.getInt("empno"));
			System.out.println(rs.getString("ename"));
			System.out.println(rs.getString("job"));
			System.out.println(rs.getInt("sal"));
			*/
			
			while(rs.next()){
				System.out.println(rs.getInt("empno"));
				System.out.println(rs.getString("ename"));
				System.out.println(rs.getString("job"));
				System.out.println(rs.getInt("sal"));
				System.out.println();
			}
			
			/*
			rs.close();
			stmt.close();
			con.close();
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
