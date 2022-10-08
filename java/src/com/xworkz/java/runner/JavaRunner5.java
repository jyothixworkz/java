package com.xworkz.java.runner;

import com.xworkz.java.dao.JavaDAO;
import com.xworkz.java.dao.JavaDAOImpl;
import com.xworkz.java.dto.JavaDTO;

public class JavaRunner5 {
	public static void main(String[] args) {
		JavaDAO javaDAO=new JavaDAOImpl();
		JavaDTO javaDTO=javaDAO.findByidAndMainThread(5, "main");
		System.out.println(javaDTO);
	}

}
