package com.xworkz.college;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.collegedao.CollegeDAO;
import com.xworkz.collegedao.CollegeDAOImpl;
import com.xworkz.collegeentity.CollegeEntity;

public class CollegeRunner {

	public static void main(String[] args) {

		CollegeEntity collegeEntity = new CollegeEntity(1, "india", "pakisthan", "pakisthan", "india", LocalDate.now(),
				LocalDate.now(), LocalTime.of(22, 00), LocalTime.of(3, 00));
		CollegeEntity collegeEntity2 = new CollegeEntity(2, "bharathi", "madegowda", "devegowda", "subbegowda",
				LocalDate.now(), LocalDate.now(), LocalTime.of(22, 00), LocalTime.of(3, 00));
		CollegeDAO collegeDAO = new CollegeDAOImpl();
		// collegeDAO.save(collegeEntity);
	//	collegeDAO.save(collegeEntity2);
	CollegeEntity	save= collegeDAO.findByid(1);
	System.out.println(save);
		collegeDAO.updateNameAndOwnerById("india", "pakistan", 2);
		// collegeDAO.deleteById(1);

	}

}
