package com.xworkz.bag;

public enum DBProperties {
	
	URL("jdbc:mysql://localhost:3306/kingfisher"),USERNAME("root"),PASSWORD("manoj@123");
	private String value;
	
	
	private DBProperties(String value) {
		this.value =value;
		
	}
	public String getValue() {
		return value;
		
		
	}
	

}
