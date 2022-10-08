package com.xworkz.jewelleryrunner;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.EntityManager;

import com.xworkz.jewelleryDAO.JewelleryDAO;
import com.xworkz.jewelleryDAO.JewelleryDAOImpl;
import com.xworkz.jewelleryentity.JewelleryEntity;

public class JewelleryRunner {

	public static void main(String[] args) {
		JewelleryEntity jewelleryEntity1 = new JewelleryEntity(2, "brunda", "maduur", 25000.00, "manoj", "jayaram",
				" siddegowgaa", LocalDate.now(), LocalDate.now(), LocalTime.of(11, 00), LocalTime.of(12, 00));
		JewelleryDAO jewelleryDAO = new JewelleryDAOImpl();
	//	boolean saved = jewelleryDAO.save(jewelleryEntity1);
		//System.out.println(saved);
		
		JewelleryEntity  jewelerry=jewelleryDAO.findByid(1);
		System.out.println(jewelerry);
		jewelleryDAO.updateNameAndLocationById("mn", "mandya", 1);
		
		jewelleryDAO.deleteById(2);
	}

}