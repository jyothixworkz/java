package com.xworkz.java.runner;

import com.xworkz.java.dao.JavaDAO;
import com.xworkz.java.dao.JavaDAOImpl;

public class JavaRunner8 {
	public static void main(String[] args) {
		JavaDAO javaDAO= new JavaDAOImpl();
		javaDAO.getTotal();
		
	}

}
