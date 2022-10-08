package com.xworkz.teatreentity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;
@Data
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="teatre_inf")

public class TeatreEntity {
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
