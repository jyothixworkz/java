package com.xworkz.jewelleryentity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
@Table(name = "juwelleryshop")
public class JewelleryEntity implements Serializable {
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "location")
	private String location;
	@Column(name = "rentofshop")
	private Double rentOfShop;
	@Column(name = "ownername")
	private String ownerName;
	@Column(name = "createdby")
	private String createdBy;
	@Column(name = "updateby")
	private String updatedby;
	@Column(name = "createddate")
	private LocalDate createdDate;
	@Column(name = "updateddate")
	private LocalDate updatedDate;
	@Column(name = "checkintime")
	private LocalTime checkInTime;
	@Column(name = "checkouttime")
	private LocalTime checkOutTime;

}
