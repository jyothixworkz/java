package com.xworkz.java.runner;

import javax.tools.JavaCompiler;

import com.xworkz.java.constant.ClassModifier;
import com.xworkz.java.constant.ClassNames;
import com.xworkz.java.constant.MethodModifier;
import com.xworkz.java.dao.JavaDAO;
import com.xworkz.java.dao.JavaDAOImpl;
import com.xworkz.java.dto.JavaDTO;

public class JavaRunner {

	
	public static void main(String[] args) {
		JavaDTO javaDTO1 = new JavaDTO(1, ClassNames.THROWABLE, "Object", "Object", "getCouse()", 3, "main",
				MethodModifier.ABSTRACT, "exception", "argtype", 1, ClassModifier.ABSTRACT, 8, 5, 5, "null", "default",
				"error", 10, 1, "object");
		JavaDTO javaDTO2 = new JavaDTO(2, ClassNames.ERROR, "Throwable", "Object", "getName()", 5, "main",
				MethodModifier.DEFAULT, "error", "argtype", 1, ClassModifier.DEFAULT, 8, 5, 5, "null", "default",
				"jverror", 10, 1, "object");
		JavaDTO javaDTO3 = new JavaDTO(3, ClassNames.EXCEPTION, "Object", "Object", "getstacktrace()", 3, "main",
				MethodModifier.PUBLIC, "exception", "argtype", 1, ClassModifier.DEFAULT, 8, 5, 5, "null", "default",
				"error", 10, 1, "object");
		JavaDTO javaDTO4 = new JavaDTO(4, ClassNames.INTERRUPTEDEXCEPTION, "Object", "Object", "getCouse", 3, "main",
				MethodModifier.ABSTRACT, "exception", "argtype", 1, ClassModifier.ABSTRACT, 8, 5, 5, "null", "default",
				"error", 10, 1, "object");
		JavaDTO javaDTO5 = new JavaDTO(5, ClassNames.IOEXCEPTION, "Object", "Object", "getCouse", 3, "main",
				MethodModifier.DEFAULT, "exception", "argtype", 1, ClassModifier.DEFAULT, 8, 5, 5, "null", "default",
				"error", 10, 1, "object");
		JavaDTO javaDTO6 = new JavaDTO(6, ClassNames.LIKAGEERROR, "Object", "Object", "getCouse", 3, "main",
				MethodModifier.ABSTRACT, "exception", "argtype", 1, ClassModifier.ABSTRACT, 8, 5, 5, "null", "default",
				"error", 10, 1, "object");
		JavaDTO javaDTO7 = new JavaDTO(7, ClassNames.RUNTIMEEXCEPTION, "Object", "Object", "getCouse", 3, "main",
				MethodModifier.ABSTRACT, "exception", "argtype", 1, ClassModifier.ABSTRACT, 8, 5, 5, "null", "default",
				"error", 10, 1, "object");
		JavaDTO javaDTO8 = new JavaDTO(8, ClassNames.VERIFYERROR, "Object", "Object", "getCouse", 3, "main",
				MethodModifier.PUBLIC, "exception", "argtype", 1, ClassModifier.FINAL, 8, 5, 5, "null", "default",
				"error", 10, 1, "object");
		JavaDTO javaDTO = new JavaDTO(9, ClassNames.VMERROR, "Object", "Object", "getCouse", 3, "main",
				MethodModifier.PUBLIC, "exception", "argtype", 1, ClassModifier.ABSTRACT, 8, 5, 5, "null", "default",
				"error", 10, 1, "object");
		JavaDAO javaDAO=new JavaDAOImpl();
		javaDAO.save(javaDTO1);
		javaDAO.save(javaDTO2);
		javaDAO.save(javaDTO3);
		javaDAO.save(javaDTO4);
		javaDAO.save(javaDTO5);
		javaDAO.save(javaDTO6);
		javaDAO.save(javaDTO7);
		javaDAO.save(javaDTO8);
		javaDAO.save(javaDTO);
	}

}
