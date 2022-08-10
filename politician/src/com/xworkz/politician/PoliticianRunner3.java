package com.xworkz.politician;

import java.util.List;

import com.xworkz.politician.dao.PoliticianDAO;
import com.xworkz.politician.dao.PoliticianDAOImpl;

public class PoliticianRunner3 {
	public static void main(String[] args) {
		
		
		PoliticianDAO politicianDAO=new PoliticianDAOImpl();
		
		List<String> politician=politicianDAO.findAllPartyName();
		System.out.println(politician);
		
		
		
	}

}
