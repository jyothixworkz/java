package com.xworkz.itentity;

import java.io.Serializable;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

import javax.persistence.*;

import lombok.*;

@Data
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "it_inf")
@NamedQueries({ @NamedQuery(name = "findByName", query = "select it  from ITEntity it where it.nameOfCompany=:nm") })

public class ITEntity implements Serializable {
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "nameofthecompany")
	private String nameOfCompany;
	@Column(name = "noofemploy")
	private Integer noOfEmploy;
	@Column(name = "owner")
	private String owner;
	@Column(name = "createdby")
	private String createdBy;
	@Column(name = "updatedby")
	private String updatedBy;
	@Column(name = "createddate")
	private LocalDate CreatedDate;
	@Column(name = "updateddate")
	private LocalDate updatedDte;
	@Column(name = "checkintime")
	private LocalTime checkInTime;
	@Column(name = "checkouttime")
	private LocalTime checkOutTime;

}
