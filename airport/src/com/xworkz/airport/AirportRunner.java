package com.xworkz.airport;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;

import com.xworkz.airportdao.AirportDAO;
import com.xworkz.airportdao.AirportDAOImpl;
import com.xworkz.airportentity.AirportEntity;

public class AirportRunner {

	public static void main(String[] args) {
		AirportEntity airportEntity = new AirportEntity(1, "kempedowda", "governament", "bjp", "congress",
				LocalDate.now(), LocalDate.now(), LocalTime.of(6, 00), LocalTime.of(12, 00));

		AirportEntity airportEntity1 = new AirportEntity(2, "yaduyurappa", "governament", "bjp", "congress",
				LocalDate.now(), LocalDate.now(), LocalTime.of(6, 00), LocalTime.of(12, 00));
		AirportDAO airportDAO = new AirportDAOImpl();
		////airportDAO.save(airportEntity1);
		//airportDAO.save(airportEntity);
		AirportEntity save = airportDAO.findByid(1);
		System.out.println(save);
		airportDAO.updateNameAndownerById("thimegowda", "private", 1);
		airportDAO.deleteById(2);

	}

}
