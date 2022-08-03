package com.xworkz.bag;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Bag {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBProperties.URL.getValue(),
				DBProperties.USERNAME.getValue(), DBProperties.PASSWORD.getValue());
		System.out.println(connection);
		String insertSql = "insert into kingfisher.kingfisherinformation value(3,'kingfisherstrom1',208.00)";
		Statement statement = connection.createStatement();
		int noOfRowsAffected = statement.executeUpdate(insertSql);
		System.out.println(noOfRowsAffected);
	}
}
