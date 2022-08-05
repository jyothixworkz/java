package com.xworkz.politician.dao;

import static com.xworkz.politician.constatnt.MySqlProperties.SECRET;
import static com.xworkz.politician.constatnt.MySqlProperties.URL;
import static com.xworkz.politician.constatnt.MySqlProperties.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicInteger;

import com.xworkz.politician.constatnt.PartyNameType;
import com.xworkz.politician.constatnt.PartySymbolType;
import com.xworkz.politician.constatnt.PresidentNames;
import com.xworkz.politician.dto.PoliticianDTO;

public class PoliticianDAOImpl implements PoliticianDAO {

	@Override
	public boolean save(PoliticianDTO dto) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue());) {
			String insert = "insert into politician.politician_inf values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(insert);
			preparedStatement.setInt(1, dto.getPid());
			preparedStatement.setString(2, dto.getName());
			preparedStatement.setString(3, dto.getPartyName().getNames());
			preparedStatement.setString(4, dto.getPresident().getPresidentNames());
			preparedStatement.setInt(5, dto.getTotalMember());
			preparedStatement.setDouble(6, dto.getPartyBudget());
			preparedStatement.setString(7, dto.getPartySymbol().getPartySymbolType());
			preparedStatement.setString(8, dto.getPartyLocation());
			preparedStatement.setString(9, dto.getHeadquaters());
			int noOfRowsAffect = preparedStatement.executeUpdate();

			System.out.println(noOfRowsAffect);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public PoliticianDTO findByPid(int pid) {

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue());) {
			String selectSql = "SELECT * FROM politician.politician_inf where pid=?";
			PreparedStatement statement = connection.prepareStatement(selectSql);
			statement.setInt(1, pid);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {

				Integer id1 = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String location = resultSet.getString(4);
				Integer totalMember = resultSet.getInt(5);
				double budget = resultSet.getDouble(6);
				String president = resultSet.getString(7);
				String headquater = resultSet.getString(8);
				String partySymbol = resultSet.getString(9);
				PoliticianDTO politicianDTO = new PoliticianDTO();
				politicianDTO.setPid(id1);
				politicianDTO.setName(name);
				politicianDTO.setPartyName(PartyNameType.getByName(partyName));
				politicianDTO.setPartyLocation(location);
				politicianDTO.setPartyBudget(budget);
				politicianDTO.setHeadquaters(headquater);
				politicianDTO.setTotalMember(totalMember);
				politicianDTO.setPresident(PresidentNames.getByName(name));
				politicianDTO.setPartySymbol(PartySymbolType.getByName(partySymbol));

				return politicianDTO;

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PoliticianDTO findByPidAndPresident(int pid, String president) {
		try (Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());){
	String select="SELECT * FROM politician.politician_inf where pid=? and president=?";
	PreparedStatement preparedStatement=connection.prepareStatement(select);
	preparedStatement.setInt(1, pid);
	preparedStatement.setString(2, president);
	ResultSet resultSet=preparedStatement.executeQuery();
	System.out.println("---------------------------");
	while(resultSet.next()) {
		System.out.println("55555555555555555555555");
	Integer pid1=resultSet.getInt(1);
	String name1=resultSet.getString(2);
	String partyName1=resultSet.getString(3);
	String location1=resultSet.getString(4);
	Integer totalMember1=resultSet.getInt(5);
	Double budget1=resultSet.getDouble(6);
	String president1=resultSet.getString(7);
	String partySymbol1=resultSet.getString(8);
	String headquater1=resultSet.getString(9);
	
	PoliticianDTO politicianDTO=new PoliticianDTO();
	
	politicianDTO.setPid(pid1);
	politicianDTO.setName(name1);
	politicianDTO.setPartyName(PartyNameType.getByName(partyName1));
	politicianDTO.setPartyLocation(location1);
	politicianDTO.setTotalMember(totalMember1);
	politicianDTO.setPartyBudget(budget1);
	politicianDTO.setPresident(PresidentNames.getByName(president1));
	politicianDTO.setHeadquaters(headquater1);
	politicianDTO.setPartySymbol(PartySymbolType.getByName(partySymbol1));
	return politicianDTO;
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}

	@Override
	public PoliticianDTO findByPidAndPresidentAndName(int pid, String president, String name ) {
		
		try (Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());){
			String select="SELECT * FROM politician.politician_inf where pid=? and president=? and name=?";
		PreparedStatement preparedStatement	=connection.prepareStatement(select);
		preparedStatement.setInt(1, pid);
		preparedStatement.setString(2, president);
		preparedStatement.setString(3, name);
	ResultSet resultSet	=preparedStatement.executeQuery();
	
	System.out.println("88888888888888888888888888877777777777777777");
	while(resultSet.next()) {
		
		System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkk");
		
		Integer pid2=resultSet.getInt(1);
		String name2=resultSet.getString(2);
		String partyName2=resultSet.getString(3);
		String location2=resultSet.getString(8);
		Integer totalMember2=resultSet.getInt(5);
		Double budget2=resultSet.getDouble(6);
		String president2=resultSet.getString(4);
		String partySymbol2=resultSet.getString(7);
		String headquater2=resultSet.getString(9);
		PoliticianDTO politicianDTO=new PoliticianDTO();
		
		politicianDTO.setPid(pid2);
		politicianDTO.setName(name2);
		politicianDTO.setPartyName(PartyNameType.getByName(partyName2));
		politicianDTO.setPartyLocation(location2);
		politicianDTO.setTotalMember(totalMember2);
		politicianDTO.setPartyBudget(budget2);
		politicianDTO.setPresident(PresidentNames.getByName(president2));
		politicianDTO.setHeadquaters(headquater2);
		politicianDTO.setPartySymbol(PartySymbolType.getByName(partySymbol2));
		return politicianDTO;

		
		
		
		
		
		
		
	}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}

	@Override
	public PoliticianDTO findByPidAndName(int pid, String name) {
		
		
		
		try(Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());) {
			String select="SELECT name from  politician.politician_inf where pid=? and name=?";
			PreparedStatement preparedStatement=connection.prepareStatement(select);
			preparedStatement.setInt(1, pid);
			preparedStatement.setString(2, name);
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				Integer pid3=resultSet.getInt(1);
				String name3=resultSet.getString(2);
				String partyName3=resultSet.getString(3);
				String location3=resultSet.getNString(8);
				double budget3=
						resultSet.getDouble(6);
				Integer totalMember3=resultSet.getInt(5);
				String headquater3=resultSet.getString(9);
				String sysmbol3=resultSet.getString(7);
				String president3=resultSet.getString(4);
				PoliticianDTO politicianDTO=new PoliticianDTO();
				
				politicianDTO.setPid(pid3);
				politicianDTO.setName(name3);
				politicianDTO.setPartyBudget(budget3);
				politicianDTO.setPartyName(PartyNameType.getByName(partyName3));
				politicianDTO.setTotalMember(totalMember3);
				politicianDTO.setPresident(PresidentNames.getByName(president3));
				politicianDTO.setHeadquaters(headquater3);
				politicianDTO.setPartyLocation(location3);
				politicianDTO.setPartySymbol(PartySymbolType.getByName(sysmbol3));
				
				
				
				
				return politicianDTO;
				
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String findNameByPid(int pid) {
		
		try (Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());){
			String select="SELECT * FROM politician.politician_inf where pid=? ";
			PreparedStatement preparedStatement=connection.prepareStatement(select);
			preparedStatement.setInt(1, pid);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				
				String name6=resultSet.getString(2);
				return name6;
				
				
				
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}

	@Override
	public String findPresidentByPidAndName(int pid, String name) {
	       try(	Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());) {
	    	   String select="SELECT  * FROM politician.politician_inf where pid=? and name=?";
	    	   PreparedStatement preparedStatement=connection.prepareStatement(select);
	    	   
	    	   preparedStatement.setInt(1, pid);
			 preparedStatement.setString(2, name);
			ResultSet  resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				String president7=resultSet.getString(4);
				return president7;
			 
			
			
			 
			 
			 
			 
		 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int getTotal() {
		try(Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());) {
			String select="SELECT * FROM politician.politician_inf";
			PreparedStatement preparedStatement=connection.prepareStatement(select);
			 ResultSet resultSet=preparedStatement.executeQuery();
			 AtomicInteger atomicInteger=new AtomicInteger();
			 while(resultSet.next()) {
				 atomicInteger.incrementAndGet(); 
				 
				 
			 }
			 System.out.println(atomicInteger.get());
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return 0;
	}

	@Override
	public PoliticianDTO findPartyNameByMaxMembers() {
		try (Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());){
			String select="SELECT max(totalmember) as maximumMember From politician.politician_inf";
			PreparedStatement preparedStatement=connection.prepareStatement(select);
			ResultSet resultSet=preparedStatement.executeQuery();
			System.out.println("💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕");
			while(resultSet.next()) {
				Integer pid9=resultSet.getInt(1);
				String name9=resultSet.getString(1);
				String partyName9=resultSet.getString(1);
				String location9=resultSet.getNString(1);
				double budget9=
						resultSet.getDouble(1);
				Integer totalMember9=resultSet.getInt(1);
				String headquater9=resultSet.getString(1);
				String sysmbol9=resultSet.getString(1);
				String president9=resultSet.getString(1);
				PoliticianDTO politicianDTO=new PoliticianDTO();
				
				politicianDTO.setPid(pid9);
				politicianDTO.setName(name9);
				politicianDTO.setPartyBudget(budget9);
				politicianDTO.setPartyName(PartyNameType.getByName(partyName9));
				politicianDTO.setTotalMember(totalMember9);
				politicianDTO.setPresident(PresidentNames.getByName(president9));
				politicianDTO.setHeadquaters(headquater9);
				politicianDTO.setPartyLocation(location9);
				politicianDTO.setPartySymbol(PartySymbolType.getByName(sysmbol9));
				
				
				
				
				return politicianDTO;
				
				
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

}

