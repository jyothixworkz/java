package com.xworkz.cartooncharacter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.cartooncharacterdao.CartoonCharacterDAO;
import com.xworkz.cartooncharacterdao.CartoonCharacterDAOImpl;
import com.xworkz.cartooncharacterentity.CartoonCharacterEntity;

public class CartoonCharacterRunner1 {
	public static void main(String[] args) {
		CartoonCharacterEntity cartoonCharacterEntity1 = new CartoonCharacterEntity("swetha", "india", "female",
				"funny", "darshan", "manoj", "sankar", LocalDateTime.now(), LocalDateTime.now());
		CartoonCharacterEntity cartoonCharacterEntity2 = new CartoonCharacterEntity("meghana", "america", "female",
				"comidy", "boomika", "sowmya", "swetha", LocalDateTime.now(), LocalDateTime.now());
		CartoonCharacterEntity cartoonCharacterEntity3 = new CartoonCharacterEntity("arjun", "australia", "male",
				"serious", "sarath", "chandru", "sachi", LocalDateTime.now(), LocalDateTime.now());
		CartoonCharacterEntity cartoonCharacterEntity4 = new CartoonCharacterEntity("nandan", "newzeland", "male",
				"ethics", "lakshmi", "chandru", "sowmya", LocalDateTime.now(), LocalDateTime.now());
		CartoonCharacterEntity cartoonCharacterEntity5 = new CartoonCharacterEntity("jayanth", "india", "male", "funny",
				"bahubali", "shimha", "sankar", LocalDateTime.now(), LocalDateTime.now());
		CartoonCharacterEntity cartoonCharacterEntity6 = new CartoonCharacterEntity("lakshmi", "poland", "female",
				"funny", "balala", "begam", "hanu", LocalDateTime.now(), LocalDateTime.now());
		CartoonCharacterEntity cartoonCharacterEntity7 = new CartoonCharacterEntity("suhas", "uae", "male", "funny",
				"devaraya", "karim", "hanumanth", LocalDateTime.now(), LocalDateTime.now());
		CartoonCharacterEntity cartoonCharacterEntity8 = new CartoonCharacterEntity("chota", "srilanka", "male",
				"funny", "sowmya", "ismail", "sarath", LocalDateTime.now(), LocalDateTime.now());
		CartoonCharacterEntity cartoonCharacterEntity9 = new CartoonCharacterEntity("beem", "pak", "male", "funny",
				"sankar", "jathish", "varun", LocalDateTime.now(), LocalDateTime.now());
		CartoonCharacterEntity cartoonCharacterEntity10 = new CartoonCharacterEntity("nandish", "afghanisthan", "male",
				"funny", "manoj", "manoj", "kalyan", LocalDateTime.now(), LocalDateTime.now());
		List<CartoonCharacterEntity> entities = new ArrayList();
		entities.add(cartoonCharacterEntity1);
		entities.add(cartoonCharacterEntity2);
		entities.add(cartoonCharacterEntity3);
		entities.add(cartoonCharacterEntity4);
		entities.add(cartoonCharacterEntity5);
		entities.add(cartoonCharacterEntity6);
		entities.add(cartoonCharacterEntity7);
		entities.add(cartoonCharacterEntity8);
		entities.add(cartoonCharacterEntity9);
		entities.add(cartoonCharacterEntity10);
		CartoonCharacterDAO cartoonCharacterDAO = new CartoonCharacterDAOImpl();
	/*	//boolean save = cartoonCharacterDAO.save(entities);
		//System.out.println(save);
	CartoonCharacterEntity	INF=cartoonCharacterDAO.findByName("beem");
	System.out.println(INF);
	Integer s=cartoonCharacterDAO.total();
	System.out.println(s);
cartoonCharacterDAO.findMaxCreatedDate();
//System.out.println(date);
   CartoonCharacterEntity     inf1=cartoonCharacterDAO.findByNameAndCountryAndGenderAndAuthor("nandan", "newzeland", "male", "lakshmi");
   System.out.println(inf1);
  String s1= cartoonCharacterDAO.findAuthorByName("nandan");
  System.out.println(s1);
Object[] b = cartoonCharacterDAO.findNameAndCountryByAuthor("balala");
System.out.println(b[0]);
System.out.println(b[1]);
   LocalDateTime info=cartoonCharacterDAO.findCreatedDateByAuthor("manoj");
  // System.out.println(info);
  // cartoonCharacterDAO.updateAuthorByName("singa", "suhas");*/
   cartoonCharacterDAO.deleteByName("beem");
  // cartoonCharacterDAO.updateTypeByName("serious", "lakshmi");

	}
      
}
