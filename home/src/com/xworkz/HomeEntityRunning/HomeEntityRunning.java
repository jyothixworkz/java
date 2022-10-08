package com.xworkz.HomeEntityRunning;

import com.xworkz.home.HomeEntity.HomeEntity;
import com.xworkz.home.dao.HomeDAOImpl;
import com.xworkz.home.dao.HomeDOA;

public class HomeEntityRunning {

	public static void main(String[] args) {

		HomeEntity homeEntity = new HomeEntity(2, "brundavana", "hulogerepura", 2000000.00, "huligerepura", "mandya",
				"karnataka");

		HomeDOA homeDOA = new HomeDAOImpl();
		boolean save = homeDOA.save(homeEntity);
		System.out.println(save);

	}

}
