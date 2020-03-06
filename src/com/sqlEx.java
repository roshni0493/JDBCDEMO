package com;

import java.sql.Connection;
//import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class sqlEx {
	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
		Statement stmt=null;
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("connected");
		
		/*DatabaseMetaData dbmt=connection.getMetaData();
		dbmt.getDatabaseMajorVersion();*/
		
		stmt=connection.createStatement();
		
			
	String	sql = "INSERT INTO student VALUES(11,'kiran','50','pune')";
		stmt.executeUpdate(sql);
		
		
		 sql="INSERT INTO student VALUES(12,'Roshni','27','Amravati')";
		stmt.executeUpdate(sql);
		
		sql="INSERT INTO student VALUES(13,'Shubham','23','Akola')";
	    stmt.executeUpdate(sql);
		
	 sql="INSERT INTO student VALUES(14,'ashwini','25','Goa')";
		stmt.executeUpdate(sql);
		
		sql="SELECT ID, Name,Age,Location FROM student";
		 ResultSet rs =stmt.executeQuery(sql); 
		 
		 ArrayList<String>al=new ArrayList<>();
		 
		 
		while(rs.next()){
			
		boolean id=al.add(rs.getString("id"));
		
			
			boolean name=al.add(rs.getString("Name"));
			
			
			
			boolean age=al.add(rs.getString("age"));
			System.out.println(age);
			
			
			
			boolean location=al.add(rs.getString("Location"));
			System.out.println(location);
			System.out.println(id);
			System.out.println(name);
			System.out.println("ID is:"+id+" ||");
			
			//System.out.println("Name is:"+name+"||");
			
			System.out.println("Age is:"+age+"||");
			
			System.out.println("Location is:"+location);
			
		/*while(rs.next()) {
			String id =rs.getString(ID);
			System.out.println(id);
		}*/
		System.out.println("All record inserted" );
		
		
		
		
		
	}

}
}