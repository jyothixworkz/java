package com.xworkz.cricketmatchentity;

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
@Table(name = "cricket_inf")

public class CricketMatchEntity implements Serializable {
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name = "presented")
	private String presented;
	@Column(name = "createdby")
	private String createdBy;
	@Column(name = "updateby")
	private String updateBy;
	@Column(name = "createddate")
	private LocalDate createdDate;
	@Column(name = "updateddate")
	private LocalDate updateddate;
	@Column(name = "checkintime")
	private LocalTime checkInTime;
	@Column(name = "checkouttime")
	private LocalTime checkOutTime;

}
