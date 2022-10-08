package com.xworkz.cricketmatchdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.cricketmatchentity.CricketMatchEntity;

public class CricketMatchDAOImpl implements CricketMatchDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager manager = null;

	@Override
	public boolean save(CricketMatchEntity cricketMatchEntity) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();

			tx.begin();
			manager.persist(cricketMatchEntity);
			tx.commit();
		} catch (PersistenceException e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}

		return false;
	}

	@Override
	public CricketMatchEntity findByid(int id) {
		EntityManager manager = factory.createEntityManager();
		try {
			CricketMatchEntity cricketMatchEntity = manager.find(CricketMatchEntity.class, id);

			if (cricketMatchEntity != null) {
				System.out.println("entity is found" + id);

			} else {
				System.out.println("entity is not found");
			}
			return cricketMatchEntity;
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}

		return null;
	}

	@Override
	public void updateNameAndPresentedById(String name, String presented, int id) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			CricketMatchEntity cricketMatchEntity = manager.find(CricketMatchEntity.class, id);
			cricketMatchEntity.setName(name);
			cricketMatchEntity.setPresented(presented);
			manager.merge(cricketMatchEntity);
			tx.commit();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}
	}

	@Override
	public void deleteById(int id) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			CricketMatchEntity cricketMatchEntity = manager.find(CricketMatchEntity.class, id);
			manager.remove(cricketMatchEntity);
			tx.commit();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}

	}

}
