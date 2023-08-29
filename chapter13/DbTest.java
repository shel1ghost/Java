import java.sql.*;
public class DbTest{
	public static void main(String[]args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcc", "root", "");
			Statement stmt = conn.createStatement();
			String sqlStmt = "SELECT * FROM users;";
			ResultSet rs = stmt.executeQuery(sqlStmt);
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
