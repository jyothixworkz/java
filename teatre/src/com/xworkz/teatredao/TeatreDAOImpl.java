package com.xworkz.teatredao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.teatreentity.TeatreEntity;

public class TeatreDAOImpl implements TeatreDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	EntityManager manager = null;

	@Override
	public boolean save(TeatreEntity teatreEntity) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(teatreEntity);
			tx.commit();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}

		return false;
	}

	@Override
	public TeatreEntity findByid(int id) {
		EntityManager manager = factory.createEntityManager();
		try {
			TeatreEntity teatreEntity = manager.find(TeatreEntity.class, id);
			if (teatreEntity != null) {
				System.out.println("entity is found" + id);
			} else {
				System.out.println("entity is not found");
			}
			return teatreEntity;
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}

		return null;
	}

	@Override
	public void updateNameAndOwnerById(String name, String owner, int id) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();

			TeatreEntity teatreEntity = manager.find(TeatreEntity.class, id);
			teatreEntity.setName(name);
			teatreEntity.setOwner(owner);
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
			TeatreEntity teatreEntity = manager.find(TeatreEntity.class, id);
			manager.remove(teatreEntity);
			tx.commit();

		} catch (Exception e) {
			e.getStackTrace();
		}
		manager.close();

	}

}
