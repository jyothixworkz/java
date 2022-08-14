package com.xworkz.it.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.internal.build.AllowSysOut;

import com.xworkz.itentity.ITEntity;

public class ITDAOImpl implements ITDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(ITEntity dao) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(dao);
			tx.commit();

		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}

		return false;
	}

	@Override
	public ITEntity findById(int id) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			ITEntity itEntity = manager.find(ITEntity.class, id);
			if (itEntity != null) {
				System.out.println("entity is found" + id);

			} else {
				System.out.println("entity is not found");
			}
			return itEntity;

		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public ITEntity findByName(String nameOfCompany) {
		EntityManager manager=null;
		System.out.println("🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️");
		try {
			System.out.println("❤❤❤❤");
		  manager= factory.createEntityManager();
		  System.out.println("💕💕💕💕💕💕💕💕💕");
		 Query query= manager.createNamedQuery("findByName");
		 System.out.println("😘😘😘😘😘😘😘😘😘😘😘😘😘");
		query.setParameter("nm", nameOfCompany);
		
		 
		 System.out.println("🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌");
		 Object object= query.getSingleResult();
		
		
		 System.out.println("😘😘😘😘😘😘😘😘😘😘");
		ITEntity itEntity=(ITEntity)object;
		
		
		return	itEntity;
		} catch (Exception e) {
e.getStackTrace();
}
		finally {
			manager.close();
		}
		
		return null;
	}

}
