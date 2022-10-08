package com.xworkz.runner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.freedomfigherentity.FreedomFighterEntity;
import com.xworkz.freedomfighterdao.FreedomFighterDAO;
import com.xworkz.freedomfighterdao.FreedomFighterDAOImpl;

public class FreedomFighterRunner {
	public static void main(String[] args) {
		FreedomFighterEntity fighterEntity=new FreedomFighterEntity(2,"Manoj",LocalDateTime.now(),"Mandya","Male","m","n",LocalDateTime.now(),LocalDateTime.now());
		fighterEntity.setId(1);
		fighterEntity.setName("manoj");
		fighterEntity.setDateOfBirth(LocalDateTime.now());
		fighterEntity.setBirthPlace("mandya");
		fighterEntity.setGender("male");
		fighterEntity.setCreatedBy("m");
		fighterEntity.setUpdatedBy("n");
		fighterEntity.setCreatedDate(LocalDateTime.now());
		fighterEntity.setUpdatedDate(LocalDateTime.now());
		
	FreedomFighterDAO freedomFighterDAO=new FreedomFighterDAOImpl();
	List<FreedomFighterEntity> entities=new ArrayList<>();
	entities.add(fighterEntity);
	freedomFighterDAO.create(entities);
	
	
	
	
	
	
	}

}
