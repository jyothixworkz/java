package com.xworkz.politician;

import java.util.List;

import com.xworkz.politician.dao.PoliticianDAO;
import com.xworkz.politician.dao.PoliticianDAOImpl;

public class PoliticianRunner4 {
	public static void main(String[] args) {
		
		PoliticianDAO politicianDAO=new PoliticianDAOImpl();
		
		List<Integer> politician=politicianDAO.findAllIds();
		
		System.out.println(politician);
		
		
		
		
	}

}
