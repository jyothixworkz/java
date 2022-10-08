package com.xworkz.cricketmatch;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.cricketmatchdao.CricketMatchDAO;
import com.xworkz.cricketmatchdao.CricketMatchDAOImpl;
import com.xworkz.cricketmatchentity.CricketMatchEntity;

public class CricketMatchRunner {

	public static void main(String[] args) {
		CricketMatchEntity cricketMatchEntity = new CricketMatchEntity(1, "odi", "pakisthan", "uganda", "india",
				LocalDate.now(), LocalDate.now(), LocalTime.of(11, 0), LocalTime.of(2, 0));
		CricketMatchEntity cricketMatchEntity1 = new CricketMatchEntity(2, "t20", "india", "karnataka", "australia",
				LocalDate.now(), LocalDate.now(), LocalTime.of(11, 0), LocalTime.of(2, 0));
		CricketMatchDAO cricketMatchDAO= new CricketMatchDAOImpl();
		//cricketMatchDAO.save(cricketMatchEntity);
		//cricketMatchDAO.save(cricketMatchEntity1);
		// CricketMatchEntity save=cricketMatchDAO.findByid(1);
		// System.out.println(save);
		cricketMatchDAO.updateNameAndPresentedById("pak", "aus", 1);
		cricketMatchDAO.deleteById(2);
	}

}
