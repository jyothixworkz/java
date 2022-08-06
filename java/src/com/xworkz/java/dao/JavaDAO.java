package com.xworkz.java.dao;

import com.xworkz.java.dto.JavaDTO;






public interface JavaDAO {
	boolean save(JavaDTO javaDTO);
	JavaDTO findByid(int id);
	JavaDTO findByidAndclassName(int pid, String className);
	JavaDTO findByidAndParentAndMainThread(int id, String parent, String mainThread);
	 JavaDTO findByidAndMainThread(int id, String mainThread);


}
