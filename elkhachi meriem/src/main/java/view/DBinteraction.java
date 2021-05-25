package  view;

 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBinteraction{
	 Connection conn;
	 Statement st;
	 ResultSet rs;
	 String url;
	 public DBinteraction() {
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			url= "jdbc:mysql://localhost:3306/elkhachimeriem";
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
	 public void connect() {
		 try {
			conn=DriverManager.getConnection(url,"root","baba1808");
			st=conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		 public void disconnect() {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		 }
		 public ResultSet Select(String sql) {
			 
			 try {
				rs=st.executeQuery(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 return rs;
		 }
		 public int MAJ(String sql) {
			 int nb=0;
			 
			 try {
				nb= st.executeUpdate(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 return nb;
		 }
		 public boolean next() {
			 try {
				return rs.next();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); return false;
			}
		 }
	 
 }