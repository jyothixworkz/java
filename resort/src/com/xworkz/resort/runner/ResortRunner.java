package com.xworkz.resort.runner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.entity.ResortEntity;

public class ResortRunner {

	public static void main(String[] args) {

	/*	ResortEntity resortEntity = new ResortEntity();

		resortEntity.setId(1);
		resortEntity.setName("manoj");
		resortEntity.setLocation("manglore");
		resortEntity.setCheckInTime(LocalTime.of(11, 00));
		resortEntity.setCheckOutTime(LocalTime.of(12, 00));
		resortEntity.setCreateBy("manoj");
		resortEntity.setCreateDate(LocalDate.now());
		resortEntity.setUpdateDate(LocalDate.now());
		resortEntity.setOwner("shankara");
		resortEntity.setPricePerDay(200000.000);
		ResortDAO resortDAO = new ResortDAOImpl();
		boolean save = resortDAO.save(resortEntity);

		System.out.println(save);*/
		
		ResortEntity resortEntity1 = new ResortEntity();

		resortEntity1.setId(2);
		resortEntity1.setName("nandan");
		resortEntity1.setLocation("banglore");
		resortEntity1.setCheckInTime(LocalTime.of(11, 00));
		resortEntity1.setCheckOutTime(LocalTime.of(12, 00));
		resortEntity1.setCreateBy("om");
		resortEntity1.setCreateDate(LocalDate.now());
		resortEntity1.setUpdateDate(LocalDate.now());
		resortEntity1.setOwner("sathya");
		resortEntity1.setPricePerDay(2000050.000);
		ResortDAO resortDAO = new ResortDAOImpl();
		boolean save = resortDAO.save(resortEntity1);

		System.out.println(save);

	}

}
