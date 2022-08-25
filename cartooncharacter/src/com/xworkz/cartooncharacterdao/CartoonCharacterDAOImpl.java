package com.xworkz.cartooncharacterdao;

import java.time.LocalDateTime;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import static com.xworkz.cartooncharacterutil.FactoryUtil.*;

import com.xworkz.cartooncharacterentity.CartoonCharacterEntity;

public class CartoonCharacterDAOImpl implements CartoonCharacterDAO {
	EntityManagerFactory factory = getFactory();

	@Override
	public boolean save(List<CartoonCharacterEntity> entities) {
		EntityManager manager = null;
		try {

			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.flush();
			for (CartoonCharacterEntity entity1 : entities) {
				manager.persist(entity1);
			}
			System.out.println("😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘");
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}

		return false;
	}

	@Override
	public CartoonCharacterEntity findByName(String name) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();

			Query query = manager.createNamedQuery("findByName");
			query.setParameter("name", name);
			Object object = query.getSingleResult();

			if (object != null) {
				CartoonCharacterEntity cartoonCharacterEntity = (CartoonCharacterEntity) object;

				return cartoonCharacterEntity;

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return null;
	}

	@Override
	public Integer total() {
		EntityManager manager = factory.createEntityManager();
		try {

			Query query = manager.createNamedQuery("findTotal");
			Object object = query.getSingleResult();
			System.out.println(object);
			if (object != null) {
				Integer integer = (Integer) object;
				return integer;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public CartoonCharacterEntity findMaxCreatedDate() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findMaxCreatedDate");
			Object object = query.getSingleResult();
			System.out.println(object);
			if (object != null) {
				CartoonCharacterEntity cartoonCharacterEntity = (CartoonCharacterEntity) object;
				return cartoonCharacterEntity;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public CartoonCharacterEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender,
			String author) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByNameAndCountryAndGenderAndAuthor");
			query.setParameter("name", name);
			query.setParameter("country", country);
			query.setParameter("gender", gender);
			query.setParameter("author", author);
			System.out.println("👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍");
			Object object = query.getSingleResult();
			System.out.println("😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘");
			if (object != null) {
				CartoonCharacterEntity cartoonCharacterEntity = (CartoonCharacterEntity) object;
				return cartoonCharacterEntity;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String findAuthorByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAuthorByName");
			query.setParameter("name", name);
			Object object = query.getSingleResult();
			if (object != null) {
				String string = (String) object;
				return string;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public Object[] findNameAndCountryByAuthor(String author) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findNameAndCountryByAuthor");
			query.setParameter("author", author);
			Object object = query.getSingleResult();
			if (object != null) {
				Object[] obj = (Object[]) object;
				return obj;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public LocalDateTime findCreatedDateByAuthor(String author) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findCreatedDateByAuthor");
			query.setParameter("author", author);
			Object object = query.getSingleResult();
			if (object != null) {
				LocalDateTime localDateTime = (LocalDateTime) object;
				return localDateTime;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public void updateAuthorByName(String newAuthir, String name) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		try {

			tx.begin();
			Query query = manager.createNamedQuery("updateAuthorByName");
			query.setParameter("author", newAuthir);
			query.setParameter("name", name);
			int count = query.executeUpdate();
			System.out.println(count);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
	}

	@Override
	public void updateTypeByName(String type, String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			Query query = manager.createNamedQuery("updateTypeByName");
			query.setParameter("type", type);
			query.setParameter("name", name);
			query.executeUpdate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

	}

	@Override
	public void deleteByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			Query query = manager.createNamedQuery("deleteByName");
			query.setParameter("name", name);
			query.executeUpdate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<CartoonCharacterEntity> findAll() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAll");
			List<CartoonCharacterEntity> list = query.getResultList();
			if (list != null) {
				return list;
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}

		return null;
	}

	@Override
	public List<CartoonCharacterEntity> findAllByAuthor1(String author) {

		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllByAuthor1");
			query.setParameter("author", author);

			List<CartoonCharacterEntity> list = query.getResultList();
			if (list != null) {
				return list;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

		return null;
	}

	@Override
	public List<CartoonCharacterEntity> findAllByAuthorAndGender1(String author, String gender) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllByAuthorANdGender");
			query.setParameter("author", author);
			query.setParameter("gender", gender);
			List<CartoonCharacterEntity> list = query.getResultList();
			if (list != null) {
				return list;
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public List<String> findAllByName() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllByName");
			List<String> list = query.getResultList();
			if (list != null) {
				return list;
			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public List<String> findAllcountry() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllCountry");
			List<String> list = query.getResultList();
			if (list != null) {
				return list;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

		return null;
	}

	@Override
	public List<Object[]> findAllNameAndCoutry() {
		EntityManager manager = factory.createEntityManager();
		try {
	Query query=		manager.createNamedQuery("findAllNameCountry");
	List<Object[]> list=	query.getResultList();
			if(list!=null) {
				return list;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public List<Object[]> findAllNameAndCoutryAndAuthor() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findNameANdCountryAndAuthor");
			List<Object[]> list =	query.getResultList();
			if(list!=null){
				return list;
			
			
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

}
