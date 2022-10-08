package com.xworkz.politician;

import com.xworkz.politician.constatnt.PartyNameType;
import com.xworkz.politician.constatnt.PartySymbolType;
import com.xworkz.politician.constatnt.PresidentNames;
import com.xworkz.politician.dao.PoliticianDAO;
import com.xworkz.politician.dao.PoliticianDAOImpl;
import com.xworkz.politician.dto.PoliticianDTO;

public class PoliticianRunner {

	public static void main(String[] args) {
		PoliticianDTO politicianDTO = new PoliticianDTO(1, " manoj", PartyNameType.MJD, PresidentNames.LATHA, 2,
				20000000.00, PartySymbolType.BOOK, "Maddur", "Sathanur");


		PoliticianDTO politicianDTO1 = new PoliticianDTO(2, " sandesh", PartyNameType.AAMAADMI, PresidentNames.CHANDRU, 2500,
				200250000.00, PartySymbolType.CAR, "mandta", "mysuru");


		PoliticianDTO politicianDTO2 = new PoliticianDTO(3, " sachi", PartyNameType.BJP, PresidentNames.DARSHAN, 25000,
				25000000.00, PartySymbolType.CYCLE, "sulya", "kunigal");


		PoliticianDTO politicianDTO3= new PoliticianDTO(4, " ranju", PartyNameType.CJD, PresidentNames.NANDAN, 2522,
				25000000.00, PartySymbolType.FAN, "bihar", "murdeshwar");



		PoliticianDTO politicianDTO4 = new PoliticianDTO(5, " pitri", PartyNameType.JDS, PresidentNames.RAGHU, 2522,
				22000000.00, PartySymbolType.FARMER, "goripalyar", "kengere");




		PoliticianDTO politicianDTO5 = new PoliticianDTO(6, " mahesh", PartyNameType.KJP, PresidentNames.SANGEETHA, 22000,
				20200000.00, PartySymbolType.KAMALA, "karnataka", "delhi");



		PoliticianDTO politicianDTO6 = new PoliticianDTO(7, " sanjay", PartyNameType.NKP, PresidentNames.SATHYA, 252200,
				252000000.00, PartySymbolType.PEN, "pune", "kalkatha");

		PoliticianDTO politicianDTO7 = new PoliticianDTO(8, " ranjith", PartyNameType.PRAJAKEEYA, PresidentNames.SOWMYA, 2522,
				25000000.00, PartySymbolType.PHONE, "india", "themilnadu");

		PoliticianDTO politicianDTO8 = new PoliticianDTO(9, " hegde", PartyNameType.RSS, PresidentNames.SUHAS, 22500,
				22500000000.00, PartySymbolType.RADIO, "bandra", "sompura");

		PoliticianDTO politicianDTO9 = new PoliticianDTO(10, " sagar", PartyNameType.SSP, PresidentNames.SUHAS, 22500,
				2250000000.00, PartySymbolType.RADIO, "bandra", "sompura");


		PoliticianDAO politicianDAO=new PoliticianDAOImpl();

		/*
		 * politicianDAO.save(politicianDTO); politicianDAO.save(politicianDTO1);
		 * politicianDAO.save(politicianDTO2); politicianDAO.save(politicianDTO3);
		 * politicianDAO.save(politicianDTO4); politicianDAO.save(politicianDTO5);
		 * politicianDAO.save(politicianDTO6); politicianDAO.save(politicianDTO7);
		 * politicianDAO.save(politicianDTO8); politicianDAO.save(politicianDTO9);
		 */

System.out.println("====================================================");

		PoliticianDTO y=politicianDAO.findByPid(4);
		System.out.println(y);

System.out.println("===========================================================");
PoliticianDTO u=politicianDAO.findByPidAndPresident(2, "Chandru");
System.out.println(u);
System.out.println("===============================================");
PoliticianDTO  i=politicianDAO.findByPidAndPresidentAndName(3,"Darshan","sachi");
System.out.println(i);
System.out.println("🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔");
PoliticianDTO k=politicianDAO.findByPidAndName(1, "manoj");
System.out.println(k);
System.out.println("==============================");
    String  s=politicianDAO.findNameByPid(8);
System.out.println(s);
System.out.println("😂😂😂😂😂😂😂😂😂😂😂😂😂😂😂😂😂😂🙌🙌🙌🙌");
String  d=politicianDAO.findPresidentByPidAndName(1, " manoj");
System.out.println(d);

politicianDAO.getTotal();
      PoliticianDTO z=politicianDAO.findPartyNameByMaxMembers();
System.out.println(z);

	}

}
