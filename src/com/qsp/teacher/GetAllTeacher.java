package com.qsp.teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetAllTeacher {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root";
		
		String sql="SELECT * FROM teacher";
		Connection connection=null;
		
		
		try {
			
			//1.load/Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection=DriverManager.getConnection(url,username,password);
			//3.CREATE Statement
			Statement statement=connection.createStatement();
			
			System.out.println("All Good");
			//4.Execute the statement
			ResultSet resultset  = statement.executeQuery(sql);
			while(resultset.next()) {
			System.out.println("================");
			System.out.println(resultset.getInt(1));
			System.out.println(resultset.getString(2));			
			System.out.println(resultset.getString(3));
			
			}
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}