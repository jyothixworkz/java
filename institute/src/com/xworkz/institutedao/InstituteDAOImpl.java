package com.xworkz.institutedao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.instituteentity.InstituteEntity;

public class InstituteDAOImpl implements InstituteDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	EntityManager manager = null;

	@Override
	public boolean save(InstituteEntity InstituteEntity) {
		// EntityManagerFactory factory =
		// Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();

		try {
			// EntityManager manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(InstituteEntity);
			tx.commit();

		} catch (PersistenceException e) {

			e.getStackTrace();
		}
		return false;
	}

	@Override
	public InstituteEntity findByid(int id) {
		EntityManager manager = factory.createEntityManager();
		try {
			// EntityManager manager = factory.createEntityManager();
			InstituteEntity entity = manager.find(InstituteEntity.class, id);
			if (entity != null) {

				System.out.println("entity is found" + id);
			} else {
				System.out.println("entity is not found");
			}
			return entity;

		} catch (PersistenceException e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}

		return null;
	}

	@Override
	public void updateNameAndTeacherById(String name, String teacher, int id) {
		EntityManager entityManager = factory.createEntityManager();
		try {
			// EntityManager entityManager = factory.createEntityManager();
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			InstituteEntity instituteEntity = entityManager.find(InstituteEntity.class, id);
			instituteEntity.setName(name);
			instituteEntity.setTeacher(teacher);
			entityManager.merge(instituteEntity);
			tx.commit();

		} catch (PersistenceException e) {
			e.getStackTrace();
		} finally {
			entityManager.close();
		}
	}

	@Override
	public void deleteById(int id) {
		EntityManager entityManager = factory.createEntityManager();
		try {
			

			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			InstituteEntity instituteEntity = entityManager.find(InstituteEntity.class, id);
			entityManager.remove(instituteEntity);
			tx.commit();

		} catch (PersistenceException e) {
			e.getStackTrace();
		} finally {
			entityManager.close();
		}

	}

}
