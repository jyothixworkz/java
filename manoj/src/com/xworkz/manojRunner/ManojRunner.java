package com.xworkz.manojRunner;

import com.xworkz.manoj.DAO.ManojDAO;
import com.xworkz.manoj.DAO.ManojDAOImpl;
import com.xworkz.manoj.DTO.ManojDTO;

public class ManojRunner {

	public static void main(String[] args) {

		ManojDTO manojDTO = new ManojDTO(1, "manoj", "huligerepur", "maddur", 5.76, 65.00, "jayaram");

		ManojDAO manojDAO = new ManojDAOImpl();
		// manojDAO.save(manojDTO);

		int s = manojDAO.findIdByName("manoj");

		System.out.println(s);

	}

}
