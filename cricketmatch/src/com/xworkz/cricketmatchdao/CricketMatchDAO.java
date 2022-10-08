package com.xworkz.cricketmatchdao;

import com.xworkz.cricketmatchentity.CricketMatchEntity;

public interface CricketMatchDAO {
	boolean save(CricketMatchEntity cricketMatchEntity);
	CricketMatchEntity findByid(int id);
	void updateNameAndPresentedById(String name, String presented , int id);
	void deleteById(int id);

}
