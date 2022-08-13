package com.xworkz.collegeentity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@ToString
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "college_inf")

public class CollegeEntity implements Serializable {
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "owner")
	private String owner;
	@Column(name = "createdby")
	private String createdBy;
	@Column(name = "updatedby")
	private String updatedBy;
	@Column(name = "createddate")
	private LocalDate createdDate;
	@Column(name = "updateddate")
	private LocalDate updatedDate;
	@Column(name = "checkintime")
	private LocalTime checkInTime;
	@Column(name = "checkouttime")
	private LocalTime checkOutTime;

}
