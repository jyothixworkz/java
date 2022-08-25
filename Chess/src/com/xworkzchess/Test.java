package com.xworkzchess;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext Context = new ClassPathXmlApplicationContext("context.xml");
		System.out.println(Context);
		Chess bean = Context.getBean(Chess.class);
		System.out.println(bean);
		     Integer bean2 = Context.getBean(Integer.class);
		     System.out.println(bean2);
		     Short bean3 = Context.getBean(Short.class);
		     System.out.println(bean3);
		Byte bean4 = Context.getBean(Byte.class);
		System.out.println(bean4);
		Long bean5 = Context.getBean(Long.class);
		System.out.println(bean5);
		Double bean6 = Context.getBean(Double.class);
		System.out.println(bean6);
		Float bean7 = Context.getBean(Float.class);
		System.out.println(bean7);
		Character bean8 = Context.getBean(Character.class);
		System.out.println(bean8);
		Boolean bean9 = Context.getBean(Boolean.class);
		System.out.println(bean9);
	
	}

}
