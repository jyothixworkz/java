package com.xworkz.company.constant;



public enum MySql {
	
	
	URL("jdbc:mysql://localhost:3306/company"),USERNAME("root"),SECRET("manoj@123");
   
	private String value;
	private MySql(String value) {
		
		this.value=value;
		
	}
	public String getValue() {
		return value;
	}
	
	
}
