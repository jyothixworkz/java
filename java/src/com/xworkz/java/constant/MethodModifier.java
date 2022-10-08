package com.xworkz.java.constant;

public enum MethodModifier {
	PUBLIC("public"),DEFAULT("default"),ABSTRACT("abstract");
	String methodMadifier;
	private MethodModifier(String methodMadifier) {
this.methodMadifier=methodMadifier;
	}
	public String getMethodMadifier() {
		return methodMadifier;
	}
	public static MethodModifier getByModifier(String modifier1) {
		MethodModifier[] methodModifiers=MethodModifier.values();
		for(MethodModifier modifier2:methodModifiers) {
			if(modifier2.methodMadifier.equals(modifier1)) {
				return modifier2;
			}
			
		}
		
		return null;
	}

}
