package com.xworkz.manoj.DTO;

import java.io.Serializable;

 import lombok.*;
 @Getter
 @Data
 @Setter
 @ToString
 @AllArgsConstructor
 @NoArgsConstructor
 

public class ManojDTO implements Serializable {

	private Integer id;
	private String name;
	private String location;
	private String village;
	private Double height;
	private Double weight;
	private String fatherName;

}
