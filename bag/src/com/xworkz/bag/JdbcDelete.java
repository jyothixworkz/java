package com.xworkz.bag;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDelete {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "manoj@123");
		System.out.println(connection);
		String deleteSql = "delete from kingfisher.kingfisherinformation where price=200.00";
		Statement statement= connection.createStatement();	
	  int noOfRowsAffected =statement.executeUpdate(deleteSql);
	  System.out.println(noOfRowsAffected);

}


}
