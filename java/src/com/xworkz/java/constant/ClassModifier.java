package com.xworkz.java.constant;

public enum ClassModifier {
	PUBLIC("public"),DEFAULT("default"),ABSTRACT("abstract"),PRIVATE("private"),FINAL("final");
	String classModifier;
	private ClassModifier(String classModifier) {
		this.classModifier=classModifier;
	}
	public String getClassModifier() {
		return classModifier;
	}
	public static ClassModifier getbyname(String classModifier1) {
		ClassModifier[] classModifiers=ClassModifier.values();
		for(ClassModifier classModifier2:classModifiers) {
			if(classModifier2.classModifier.equals(classModifier1)) {
				return classModifier2;
			}
			
		}
		
		return null;
	}

}
