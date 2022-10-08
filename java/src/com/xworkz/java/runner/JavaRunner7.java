package com.xworkz.java.runner;

import com.xworkz.java.dao.JavaDAO;
import com.xworkz.java.dao.JavaDAOImpl;
import com.xworkz.java.dto.JavaDTO;

public class JavaRunner7 {
	public static void main(String[] args) {
		JavaDAO javaDAO=new JavaDAOImpl();
		String  javaDTO=javaDAO.findParentByidAndMainThread(1, "main");
		System.out.println(javaDTO);
		
	}

}
