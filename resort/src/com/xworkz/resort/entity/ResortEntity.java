package com.xworkz.resort.entity;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;
@Data
@AllArgsConstructor
@Entity
@Table(name="resort_inf")

public class ResortEntity implements Serializable {
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="checkintime")
	private LocalTime checkInTime;
	@Column(name="checkouttime")
	private LocalTime checkOutTime;
	@Column(name="createby")
	private String createBy;
	@Column(name="createdate")
	private LocalDate createDate;
	@Column(name="updatedate")
	private LocalDate updateDate;
	@Column(name="owner")
	private String owner;
	@Column(name="priceperday")
	private double  pricePerDay;
	
	
	
	

}
