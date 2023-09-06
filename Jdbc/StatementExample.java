package Jdbc;
import java.sql.*;

public class StatementExample{

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","melciya@123");
		
		//Insert
		String query ="insert into login values(4,'Tim','444')";
		Statement st = con.createStatement();
		st.executeUpdate(query);
		System.out.println("Inserted successfully");
		
		//Read
		query = "select * from login";
		ResultSet rs = st.executeQuery(query);
		while (rs.next()){
			System.out.println("ID: "+rs.getInt("id"));
			System.out.println("Username: "+rs.getString("username"));
			System.out.println("Password: "+rs.getString("password"));
			
		}
		
		//Delete
		query = "delete from login where id = 2";
		int x = st.executeUpdate(query);
		System.out.println("Deleted successfully");
		
		//Modify
        query = "update login set username = 'Harry' where id = 3;";
        x = st.executeUpdate(query);
        System.out.println("Updated successfully");

	}

}
