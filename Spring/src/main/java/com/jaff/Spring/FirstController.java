package com.jaff.Spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Retry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	@RequestMapping("name")
	String getName() {
		return "Finzly";
	}
	
	@RequestMapping("list")
	ArrayList<Integer> getList()
	{
		ArrayList<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		
		return l;
	}
	
	
	@RequestMapping("n")
	float getData()
	{
		return 97.9f;
	}
	
	@RequestMapping("data")
	List<String> getdata() throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","melciya@123");
		Statement st=con.createStatement();
		String query = "select * from login";
		ResultSet rs=st.executeQuery(query);
		List<String> list = new ArrayList<>();
		while(rs.next()) {
			String username = rs.getString("username");
			list.add(username);
		}
		System.out.println(list);
		return list;
		
	}

}
