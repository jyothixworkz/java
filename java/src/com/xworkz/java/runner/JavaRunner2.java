package com.xworkz.java.runner;

import com.xworkz.java.dao.JavaDAO;
import com.xworkz.java.dao.JavaDAOImpl;
import com.xworkz.java.dto.JavaDTO;

public class JavaRunner2 {
public static void main(String[] args) {
	JavaDAO javaDAO=new JavaDAOImpl();
	JavaDTO DTO=javaDAO.findByid(1);
	System.out.println(DTO);
}

}
