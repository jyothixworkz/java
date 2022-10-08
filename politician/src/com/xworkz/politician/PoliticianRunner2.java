package com.xworkz.politician;

import java.util.List;

import com.xworkz.politician.dao.PoliticianDAO;
import com.xworkz.politician.dao.PoliticianDAOImpl;
import com.xworkz.politician.dto.PoliticianDTO;

public class PoliticianRunner2 {

	public static void main(String[] args) {
PoliticianDAO politicianDAO= new PoliticianDAOImpl();

List<PoliticianDTO> politician=politicianDAO.findAll();
		
		System.out.println(politician);
		
		
		
		
		
		
		
		
		
	}

}
