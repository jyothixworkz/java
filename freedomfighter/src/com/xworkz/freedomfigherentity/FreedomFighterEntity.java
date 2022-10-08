package com.xworkz.freedomfigherentity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.*;

@AllArgsConstructor
@ToString
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="freedomfigher_inf")
public class FreedomFighterEntity extends ParentEntity implements Serializable {
	//@GenericGenerator(name = "mano", strategy = "increment")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	private String name;
	private LocalDateTime dateOfBirth;
	private String gender;
	@Column(name = "birthLocation")
	private String birthPlace;

	public FreedomFighterEntity(Integer id, String name, LocalDateTime dateOfBirth, String gender, String birthPlace,
			String createdBy, String updatedBy, LocalDateTime createdDate, LocalDateTime updatedDate) {
		super(createdBy, updatedBy, createdDate, updatedDate);
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.birthPlace = birthPlace;
	}

}
