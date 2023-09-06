package Jdbc;
import java.sql.*;

public class PreparedStatementExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","melciya@123");
		
		 // Insert
        String query = "insert into login values (?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1,7);
        ps.setString(2,"Timmon");
        ps.setString(3,"777");
        ps.executeUpdate();
        System.out.println("Inserted successfully");

        // Read
        query = "select * from login";
        ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
			System.out.println("ID: "+rs.getInt("id"));
			System.out.println("Username: "+rs.getString("username"));
			System.out.println("Password: "+rs.getString("password"));
			
		}

        //Delete
        query = "delete from login where id=?";
        ps = con.prepareStatement(query);
        ps.setInt(1,4);
        int x = ps.executeUpdate();
        System.out.println("Deleted successfully");

        //Modify
        query = "update login set username = 'Jaffrin' where id = 6;";
        ps = con.prepareStatement(query);
        x = ps.executeUpdate();
        System.out.println("Updated successfully");

	}

}
