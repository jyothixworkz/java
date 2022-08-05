package com.xworkz.politician.constatnt;

import lombok.Getter;

public enum PresidentNames {
	MANOJ("Manoj"), DARSHAN("Darshan"), SUHAS("Suhas"), SATHYA("Sathya"), SANGEETHA("Sangeetha"), SOWMYA("Sowmya"),
	RAGHU("Raghu"), LATHA("Latha"), NANDAN("Nandan"), CHANDRU("Chandru");
	
private String names;
   private PresidentNames(String names) {
	   
	    this.names=names;
	   
	   
}
	
	
	public String getPresidentNames() {
		return names;
	}
	
public static 	PresidentNames getByName(String names) {
	PresidentNames[] partyNames= PresidentNames.values();
		
		 for(PresidentNames partNames2:partyNames) {
			 
			 if(partNames2.names.equals(names));
			 return partNames2;
			 
			 
		 }
		
		return null;
		
	}
	
	
}
	
	
	
	
	


