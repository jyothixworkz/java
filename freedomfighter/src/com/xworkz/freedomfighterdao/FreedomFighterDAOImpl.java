package com.xworkz.freedomfighterdao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.freedomfigherentity.FreedomFighterEntity;
import com.xworkz.util.Factory;

public class FreedomFighterDAOImpl implements FreedomFighterDAO {

	@Override
	public boolean create(List<FreedomFighterEntity> freedomFighterEntity) {
		
		EntityManagerFactory factory=Factory.getFactory();
		EntityManager manager=factory.createEntityManager();
	EntityTransaction tx=	manager.getTransaction();
		tx.begin();
		for (FreedomFighterEntity freedomFighterEntity1 : freedomFighterEntity) {
			
			manager.persist(freedomFighterEntity1);
		}
		
		tx.commit();
		manager.close();
		return false;
	}
	
	

}
