package com.xworkz.job.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.job.dto.JobDTO;
import static com.xworkz.job.constatnt.MySqlProperties.*;

public class JobDAOImpl implements JobDAO {

	@Override
	public boolean save(JobDTO jobDTO) {
		
		try {
			Connection connection=DriverManager.getConnection(URL.getValue(),USERNAME.getValue(), SECRET.getValue());
			String insertSql="insert into job.job_inf value(?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(insertSql);
			statement.setInt(1, jobDTO.);
			
		}
		   catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		return false;
	}
	
	
	
	
	
	

}
