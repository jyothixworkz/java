package com.xworkz.politician.dto;

import java.io.Serializable;

import com.xworkz.politician.constatnt.PartyNameType;
import com.xworkz.politician.constatnt.PartySymbolType;
import com.xworkz.politician.constatnt.PresidentNames;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PoliticianDTO  implements Serializable{
	
	private  Integer pid;
	private  String name;
	private PartyNameType partyName;
	private PresidentNames president;
	private int totalMember;
	private double partyBudget;
	private PartySymbolType partySymbol=PartySymbolType.BOOK;
	private String partyLocation;
	private String headquaters ;
	
	
	
	
	
	
	
	
	
	

}
