package com.xworkz.collegedao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.collegeentity.CollegeEntity;

public class CollegeDAOImpl implements CollegeDAO {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager manager = null;

	@Override
	public boolean save(CollegeEntity collegeEntity) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();

			tx.begin();
			manager.persist(collegeEntity);
			tx.commit();
		} catch (PersistenceException e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}

		return false;
	}

	@Override
	public CollegeEntity findByid(int id) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		try {
			CollegeEntity collegeEntity = manager.find(CollegeEntity.class, id);
			if (collegeEntity != null) {
				System.out.println("entity is found" + id);
			} else {
				System.out.println("entity is not found");
			}
			return collegeEntity;
		} catch (PersistenceException e) {
			e.getStackTrace();

		} finally {
			manager.close();
		}

		return null;
	}

	@Override
	public void updateNameAndOwnerById(String name, String owner, int id) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			CollegeEntity collegeEntity = manager.find(CollegeEntity.class, id);
			collegeEntity.setName(name);
			collegeEntity.setOwner(owner);
			manager.merge(collegeEntity);
			tx.commit();
		} catch (PersistenceException e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}
	}

	@Override
	public void deleteById(int id) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			CollegeEntity collegeEntity = manager.find(CollegeEntity.class, id);
			manager.remove(collegeEntity);
			tx.commit();

		} catch (PersistenceException e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}

	}

}
