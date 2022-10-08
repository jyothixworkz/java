package com.xworkz.home.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.home.HomeEntity.HomeEntity;

public class HomeDAOImpl implements HomeDOA {

	@Override
	public boolean save(HomeEntity entity) {

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

			EntityManager manager = factory.createEntityManager();

			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();
			manager.close();
			factory.close();
			

		} catch (PersistenceException e) {

			e.getStackTrace();
		}

		return true;
	}

}
