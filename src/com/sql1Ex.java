package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sql1Ex {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.jdbc.mysql.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeelist","root","root");
		Statement stmt= con.createStatement();
		
		String sql="SELECT employeelist FROM student";
		stmt.execute(sql);

	}

}
