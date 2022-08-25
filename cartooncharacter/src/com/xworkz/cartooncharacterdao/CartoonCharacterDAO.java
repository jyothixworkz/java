package com.xworkz.cartooncharacterdao;

import java.time.LocalDateTime;
import java.util.List;

import com.xworkz.cartooncharacterentity.CartoonCharacterEntity;

import net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator.ForTypeResourceUrl;

public interface CartoonCharacterDAO {
	boolean save(List<CartoonCharacterEntity> entities);

	CartoonCharacterEntity findByName(String name);

	default Integer total() {
		return null;

	}

	default CartoonCharacterEntity findMaxCreatedDate() {
		return null;

	}

	CartoonCharacterEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender,
			String author);

	String findAuthorByName(String name);

	Object[] findNameAndCountryByAuthor(String author);

	LocalDateTime findCreatedDateByAuthor(String author);

	void updateAuthorByName(String newAuthir, String name);

	void updateTypeByName(String type, String name);

	void deleteByName(String name);
	List<CartoonCharacterEntity> findAll();
	List<CartoonCharacterEntity> findAllByAuthor1(String Author);
	List<CartoonCharacterEntity> findAllByAuthorAndGender1(String author,String gender);
	List<String> findAllByName();
	List<String> findAllcountry();
	List<Object[]> findAllNameAndCoutry();
	List<Object[]> findAllNameAndCoutryAndAuthor();

}

