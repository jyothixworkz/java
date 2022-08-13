package com.xworkz.instituteentity;

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
@Table(name = "institute_inf")
public class InstituteEntity implements Serializable {
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "owner")
	private String owner;
	@Column(name = "hr")
	private String HR;
	@Column(name = "teacher")
	private String teacher;
	@Column(name = "createdby")
	private String createdBy;
	@Column(name = "createddate")
	private LocalDate createdDate;
	@Column(name = "checkintime")
	private LocalTime checkInTime;
	@Column(name = "checkouttime")
	private LocalTime checkOutTime;

}
