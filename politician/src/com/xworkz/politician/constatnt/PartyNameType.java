package com.xworkz.politician.constatnt;

import lombok.Getter;

public enum PartyNameType {
	
BJP("BJP"),KJP("KJP"),JDS("JDS"),AAMAADMI("Aamaadmi"),RSS("RSS"),PRAJAKEEYA("Prajakeeya"),SSP("SSP"),MJD("MJD"),CJD("CJD"),NKP("NKP");	
	
	private String name;
	
	private PartyNameType( String name) {

	this.name=name;
	
	
	}
	
	public String getNames() {
		return name;
	
	
	

}
	
	public static PartyNameType getByName(String name) {
		
		PartyNameType[] partyNameTypes=PartyNameType.values();
		for(PartyNameType partyNameType2:partyNameTypes) {
			if(partyNameType2.name.equals(name));
			return partyNameType2;
			
			
		}
		return null;
		
		
		
	}
	
	
}
