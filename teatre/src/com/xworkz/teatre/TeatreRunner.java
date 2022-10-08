package com.xworkz.teatre;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.teatredao.TeatreDAO;
import com.xworkz.teatredao.TeatreDAOImpl;
import com.xworkz.teatreentity.TeatreEntity;

public class TeatreRunner {
	public static void main(String[] args) {
		TeatreEntity teatreEntity = new TeatreEntity(1, "mahalakshmi", "manoj", "darshan", "nandan", LocalDate.now(),
				LocalDate.now(), LocalTime.of(10, 0), LocalTime.of(1, 0));
		TeatreEntity teatreEntity1 = new TeatreEntity(2, "sumbalaksmi", "sandesh", "varun", "latha", LocalDate.now(),
				LocalDate.now(), LocalTime.of(10, 0), LocalTime.of(1, 0));
		TeatreDAO teatreDAO = new TeatreDAOImpl();
	/*	teatreDAO.save(teatreEntity);
		teatreDAO.save(teatreEntity1);
		TeatreEntity save = teatreDAO.findByid(1);
		System.out.println(save);
		teatreDAO.updateNameAndOwnerById("mgu", "subha", 1);*/
		teatreDAO.deleteById(2);
	}

}
