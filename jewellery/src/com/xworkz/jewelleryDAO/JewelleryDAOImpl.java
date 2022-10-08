package com.xworkz.jewelleryDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.jewelleryentity.JewelleryEntity;

public class JewelleryDAOImpl implements JewelleryDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager entityManager = null;

	@Override
	public boolean save(JewelleryEntity jewelleryEntity) {
		try {
			EntityManager entityManager = factory.createEntityManager();
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			entityManager.persist(jewelleryEntity);
			tx.commit();
			entityManager.close();
		} catch (PersistenceException e) {

			e.getStackTrace();

		}

		return false;
	}

	@Override
	public JewelleryEntity findByid(int id) {
		EntityManager entityManager = factory.createEntityManager();
		try {
			JewelleryEntity jewelleryEntity = entityManager.find(JewelleryEntity.class, id);

			if (jewelleryEntity != null) {

				System.out.println("entity table is found" + id);

			} else {
				System.out.println("entity is not found");
			}

			return jewelleryEntity;
		} catch (PersistenceException e) {

			e.getStackTrace();
		} finally {
			entityManager.close();
		}

		return null;
	}

	@Override
	public void updateNameAndLocationById(String name, String location, int id) {
		try {
			EntityManager entityManager = factory.createEntityManager();
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			JewelleryEntity jewelleryEntity = entityManager.find(JewelleryEntity.class, id);
			jewelleryEntity.setName(name);
			jewelleryEntity.setLocation(location);
			entityManager.merge(jewelleryEntity);
			tx.commit();

		} catch (PersistenceException e) {
			e.getStackTrace();
		} finally {

		}

	}

	@Override
	public void deleteById(int id) {
		
		EntityManager entityManager=factory.createEntityManager();
		try {
			 EntityTransaction tx=entityManager.getTransaction();
			 tx.begin();
			JewelleryEntity jewelleryEntity= entityManager.find(JewelleryEntity.class, id);
			 entityManager.remove(jewelleryEntity);
			 tx.commit();
			 
			
		}
		catch(PersistenceException e) {
			
			e.getStackTrace();
		}
		finally {
			entityManager.close();
		}
	}

}
