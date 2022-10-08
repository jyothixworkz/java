package com.xworkz.home.HomeEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "home_inf")

public class HomeEntity implements Serializable {
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "location")
	private String location;
	@Column(name = "rate")
	private Double rate;
	@Column(name = "villagename")
	private String villageName;
	@Column(name = "distictname")
	private String distictName;
	@Column(name = "statename")

	private String stateName;
}
