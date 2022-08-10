package com.xworkz.company.DTA;


import java.io.Serializable;

 



import lombok.*;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class CompanyDTO  implements Serializable{
	
	
	Integer sl;
	String employName;
	Double sallary;
	
String company_infcol;
}
