package com.xworkz.institute;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.institutedao.InstituteDAO;
import com.xworkz.institutedao.InstituteDAOImpl;
import com.xworkz.instituteentity.InstituteEntity;

public class InstituteRunner {

	public static void main(String[] args) {

		// InstituteEntity instituteEntity = new InstituteEntity(1, "xworkz", "omkar",
		// "vinay", "asha", "nandan",
		// LocalDate.now(), LocalTime.of(11, 00), LocalTime.of(12, 00));
		InstituteEntity instituteEntity1 = new InstituteEntity(2, "j", "sadananda", "venkey", "usha", "sandan",
				LocalDate.now(), LocalTime.of(11, 00), LocalTime.of(12, 00));

		InstituteDAO instituteDAO = new InstituteDAOImpl();
		boolean saved = instituteDAO.save(instituteEntity1);
		System.out.println(saved);
		InstituteEntity show = instituteDAO.findByid(1);
		System.out.println(show);
		instituteDAO.updateNameAndTeacherById("xworkz", "asha m test", 1);
		instituteDAO.deleteById(1);

	}

}