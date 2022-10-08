package com.xworkz.manoj.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.manoj.DTO.ManojDTO;

public class ManojDAOImpl implements ManojDAO {

	@Override
	public boolean save(ManojDTO manojDTO) {

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manoj", "root",
					"manoj@123");

			String select = "insert into manoj.manoj_inf values(?,?,?,?,?,?,?)";

			PreparedStatement preparedStatement = connection.prepareStatement(select);
			preparedStatement.setInt(1, manojDTO.getId());
			preparedStatement.setString(2, manojDTO.getName());
			preparedStatement.setString(3, manojDTO.getLocation());
			preparedStatement.setString(4, manojDTO.getVillage());
			preparedStatement.setDouble(5, manojDTO.getHeight());
			preparedStatement.setDouble(6, manojDTO.getWeight());
			preparedStatement.setString(7, manojDTO.getFatherName());

			int noOfRows = preparedStatement.executeUpdate();
			System.out.println(noOfRows);

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return false;
	}

	@Override
	public int findIdByName(String name) {
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manoj", "root",
					"manoj@123");
			
			String select = "SELECT * FROM manoj.manoj_inf where name=? ";
			
			           PreparedStatement preparedStatement= connection.prepareStatement(select);
			               preparedStatement.setString(1, name);
			          ResultSet resultSet=  preparedStatement.executeQuery();
			           while(resultSet.next()) {
			        	   
			        	   int id2=resultSet.getInt(1);
			        	   
			        	  return id2; 
			        	   
			        	   
			        	   
			           }
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		return 0;
	}

}
