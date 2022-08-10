package com.xworkz.java.runner;

import com.xworkz.java.dao.JavaDAO;
import com.xworkz.java.dao.JavaDAOImpl;
import com.xworkz.java.dto.JavaDTO;

public class Javarunner6 {
	public static void main(String[] args) {
		JavaDAO javaDAO=new JavaDAOImpl();
		String  javaDTO=javaDAO.findMainThreadByid(9);
		System.out.println(javaDTO);
	}

}
