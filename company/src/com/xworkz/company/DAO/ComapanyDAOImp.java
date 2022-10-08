package com.xworkz.company.DAO;


import static com.xworkz.company.constant.MySql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.company.DTA.CompanyDTO;

public class ComapanyDAOImp implements CompanyDAO {

	@Override
	public boolean sava(CompanyDTO companyDTO) {
		try(Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());) {
			//Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String select="insert into company.company_inf values(?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(select);
			preparedStatement.setInt(1,companyDTO.getSl());
			preparedStatement.setString(2, companyDTO.getEmployName());
			preparedStatement.setDouble(3, companyDTO.getSallary());
			preparedStatement.setString(4, companyDTO.getCompany_infcol());
			System.out.println("🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️");
		 
int noOfRow=preparedStatement.executeUpdate();
			System.out.println(noOfRow);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		return false;
	}
	
	
	

}
