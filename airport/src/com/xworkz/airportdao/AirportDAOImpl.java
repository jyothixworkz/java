package com.xworkz.airportdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.airportentity.AirportEntity;

public class AirportDAOImpl implements AirportDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager manager = null;

	@Override
	public boolean save(AirportEntity airportEntity) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();

			tx.begin();
			manager.persist(airportEntity);
			tx.commit();
		} catch (PersistenceException e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}
		return false;
	}

	@Override
	public AirportEntity findByid(int id) {
		EntityManager manager = factory.createEntityManager();
		try {
			AirportEntity airportEntity = manager.find(AirportEntity.class, id);
			if (airportEntity != null) {
				System.out.println("entity is fount" + id);
			} else {
				System.out.println("entity is not found");
			}
			return airportEntity;
		} catch (PersistenceException e) {
			e.getStackTrace();

		} finally {
			manager.close();
		}

		return null;
	}

	@Override
	public void updateNameAndownerById(String name, String owner, int id) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			AirportEntity airportEntity = manager.find(AirportEntity.class, id);
			airportEntity.setName(name);
			airportEntity.setOwner(owner);
			manager.merge(airportEntity);
			tx.commit();
		} catch (PersistenceException e) {
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
			AirportEntity airportEntity = manager.find(AirportEntity.class, id);
			manager.remove(airportEntity);
			tx.commit();

		} catch (PersistenceException e) {
			e.getStackTrace();

		} finally {
			manager.close();
		}

	}

}
