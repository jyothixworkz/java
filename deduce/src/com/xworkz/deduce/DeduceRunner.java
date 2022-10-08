package com.xworkz.deduce;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.deducedao.DeduceDAO;
import com.xworkz.deducedao.DeduceDAOImpl;
import com.xworkz.deduceentity.DeduceEntity;

public class DeduceRunner {
	public static void main(String[] args) {
		DeduceEntity deduceEntity = new DeduceEntity(1, "latha", "deduce", "manya", "sowmya", LocalDate.now(),
				LocalDate.now(), LocalTime.of(9, 00), LocalTime.of(7, 0));
		DeduceEntity deduceEntity2 = new DeduceEntity(2, "somya", "deduce", "manya", "sowmya", LocalDate.now(),
				LocalDate.now(), LocalTime.of(9, 00), LocalTime.of(7, 0));

		DeduceDAO dao = new DeduceDAOImpl();
		//dao.save(deduceEntity2);
		//dao.save(deduceEntity);
	DeduceEntity	save= dao.findByid(1);
	System.out.println(save);
	 dao.updateNameAndOwnerById("ganga", "omkar", 2);
		 dao.deleteById(2);

	}

}
