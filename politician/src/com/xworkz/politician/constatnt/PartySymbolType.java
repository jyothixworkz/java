
package com.xworkz.politician.constatnt;

public enum PartySymbolType {
	
KAMALA("Kamala"),	TV("TV"),PHONE("Phone"),FAN("Fan"),CYCLE("Cycle"),CAR("Car"),PEN("Pen"),RADIO("Radio"),BOOK("Book"), FARMER("Farmer");
	
	private String type;

	private PartySymbolType( String type) {
		
		this.type=type;
		
		
	}
	
	public String getPartySymbolType() {
		return type;
		
		
	}
public static PartySymbolType getByName(String type) {
		
	PartySymbolType[] partySymbolType=PartySymbolType.values();
		for(PartySymbolType partySymbolType2:partySymbolType) {
			
		if(partySymbolType2.type.equals(type));
			
			return partySymbolType2;
		}
		return null;
	
}

public static PartySymbolType getBySymbol(String symbol) {
	// TODO Auto-generated method stub
	return null;
}
}
