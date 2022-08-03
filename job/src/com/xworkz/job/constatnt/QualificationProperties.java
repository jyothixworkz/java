package com.xworkz.job.constatnt;

public enum QualificationProperties {
	BE("BE"),BAC("BCA"),BCOM("BCOM"),BSC("BSC"),DEFAULT("default");
	
	
	private String stream;
	
	
	private QualificationProperties( String stream) {
		
		this.stream=stream;
		
		
		
		
		
		
	}
	
	
	public String getStream() {
		return stream;
	}                                                                     
	
	

}
