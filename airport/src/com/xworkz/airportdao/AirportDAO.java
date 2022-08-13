package com.xworkz.airportdao;

import com.xworkz.airportentity.AirportEntity;

public interface AirportDAO {
	boolean save(AirportEntity airportEntity);

	AirportEntity findByid(int id);

	void updateNameAndownerById(String name, String owner, int id);

	void deleteById(int id);

}
