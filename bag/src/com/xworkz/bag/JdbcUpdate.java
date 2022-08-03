package com.xworkz.bag;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "manoj@123");
		System.out.println(connection);
		String updateSql = "update kingfisher.kingfisherinformation set name='beer'where price =200.00";
		Statement statement= connection.createStatement();	
	  int noOfRowsAffected =statement.executeUpdate(updateSql);
	  System.out.println(noOfRowsAffected);

}
}
