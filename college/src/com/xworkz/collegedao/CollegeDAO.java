package com.xworkz.collegedao;

import com.xworkz.collegeentity.CollegeEntity;

public interface CollegeDAO {
	boolean save(CollegeEntity collegeEntity);
	CollegeEntity findByid(int id);
	void updateNameAndOwnerById(String name, String owner , int id);
	void deleteById(int id);

}
