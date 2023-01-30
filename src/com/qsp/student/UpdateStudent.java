package com.qsp.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudent {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root";
		
		String sql="UPDATE student SET name='PANT' WHERE rollno=1";
		Connection connection=null;
		
		
		try {
			
			//1.load/Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. To establish connection
			connection=DriverManager.getConnection(url,username,password);
			//3.CREATE Statement
			Statement statement=connection.createStatement();
			//4.Execute the statement
			try {
				statement.execute(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("All Good");
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//close the connection
			connection.close();
		}

	}

}
