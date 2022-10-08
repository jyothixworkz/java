package com.xworkz.deducedao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.deduceentity.DeduceEntity;

public class DeduceDAOImpl implements DeduceDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager manager = null;

	@Override
	public boolean save(DeduceEntity deduceEntity) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(deduceEntity);
			tx.commit();

		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}

		return false;
	}

	@Override
	public DeduceEntity findByid(int id) {
		EntityManager manager = factory.createEntityManager();
		try {
			DeduceEntity deduceEntity = manager.find(DeduceEntity.class, id);
			if (deduceEntity != null) {
				System.out.println("entity is found " + id);

			} else {
				System.out.println("entity is not found");
			}
			return deduceEntity;
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
			DeduceEntity deduceEntity = manager.find(DeduceEntity.class, id);
			deduceEntity.setEmployName(name);
			deduceEntity.setOwner(owner);
			manager.merge(deduceEntity);
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
			DeduceEntity deduceEntity = manager.find(DeduceEntity.class, id);
			manager.remove(deduceEntity);
			tx.commit();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}
	}

}
