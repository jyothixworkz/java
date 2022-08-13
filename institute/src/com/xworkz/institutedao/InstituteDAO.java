package com.xworkz.institutedao;

import com.xworkz.instituteentity.InstituteEntity;

public interface InstituteDAO {

	boolean save(InstituteEntity InstituteEntity);

	InstituteEntity findByid(int id);

	void updateNameAndTeacherById(String name, String teacher, int id);

	void deleteById(int id);

}
