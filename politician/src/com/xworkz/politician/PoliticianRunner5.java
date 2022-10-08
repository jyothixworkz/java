package com.xworkz.politician;

import java.util.List;

import com.xworkz.politician.dao.PoliticianDAO;
import com.xworkz.politician.dao.PoliticianDAOImpl;

public class PoliticianRunner5 {
	
	public static void main(String[] args) {
PoliticianDAO politicianDAO= new PoliticianDAOImpl();

List<Object> politician=politicianDAO.findAllNoOfMembersAndTotalBudgetAndPartyName();
		System.out.println(politician);
		
		
		
	}
	


	
	

}
