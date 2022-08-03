package com.xworkz.job.dto;


import java.io.Serializable;

import com.xworkz.job.constatnt.DesignationProperties;
import com.xworkz.job.constatnt.QualificationProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class JobDTO  implements Serializable {
	
	
private Integer id;
private DesignationProperties designation=DesignationProperties.DEFAULT;
private double anualIncome ;
private QualificationProperties qualification=QualificationProperties.DEFAULT;
private double percentage;
private boolean fresher;

	
	
	
	
	
	

}
