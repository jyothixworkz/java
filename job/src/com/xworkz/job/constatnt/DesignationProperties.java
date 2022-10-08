package com.xworkz.job.constatnt;

public enum DesignationProperties {

	SYSTEM_ENGINEER("system_engineer"),
	TECHNICAL_SUPPORT_ENGINEER("technical_engineer"),
	NETWORK_ENGINEER("network_engineer"),
	SOFTWARE_TESTER_ENGINEER("software_tester_engineer"),
	SOFTWARE_DEVELOPER_ENGINEER("software_developer_engineer"),
	DEFAULT("default");
	
	
	 private String type;
	  private DesignationProperties(String type) {
		  
		  this.type=type;
		  
		  
	}
	  public String getType() {
		return type;
	}
	
	
	

}