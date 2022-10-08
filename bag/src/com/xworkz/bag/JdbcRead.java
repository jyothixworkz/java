package com.xworkz.bag;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRead {
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "manoj@123");
		System.out.println(connection);
		String sql="SELECT * FROM kingfisher.kingfisherinformation where price=205";
	 Statement statement=connection.createStatement();
       ResultSet resultSet=statement.executeQuery(sql);
     // boolean result= resultSet.next();
      if(resultSet.next()) {
    	  
      
      //System.out.println(result);
       int id=resultSet.getInt(1);
       System.out.println(id);
       String name=resultSet.getString(2);
       System.out.println(name);
      double price = resultSet.getDouble(3);
      System.out.println(price);
      }
      else {
    	  System.out.println("table not found");
      }
       }


}
