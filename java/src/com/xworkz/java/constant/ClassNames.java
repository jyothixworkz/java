package com.xworkz.java.constant;

public enum ClassNames {

	THROWABLE("Throwable"), EXCEPTION("Exception"), ERROR("Error"), RUNTIMEEXCEPTION("RuntimeException"),
	IOEXCEPTION("IOException"), INTERRUPTEDEXCEPTION("InterruptedException"), VMERROR("VMError"),
	LIKAGEERROR("LikageError"), VERIFYERROR("VerifyError");
	String className;
	private ClassNames(String className) {
		this.className=className;
	}
	public String getClassName() {
		return className;
	}
	public static ClassNames getByName(String className1) {
		
		ClassNames[] classNames=ClassNames.values();
		for(ClassNames classNames2:classNames) {
			if(classNames2.className.equals(className1)){
				return classNames2;
			}
		
		}
			return null;	
	}
}
