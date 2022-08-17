package com.xworkz.cartooncharacterentity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.*;

@Data
@ToString

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "cartooncharacter_inf")
@NamedQueries({
		@NamedQuery(name = "findByName", query = "select cartoon from CartoonCharacterEntity cartoon where cartoon.name=:name"),
		@NamedQuery(name = "findTotal", query = "select count(*) from CartoonCharacterEntity cartoon "),
		@NamedQuery(name = "findMaxCreatedDate", query = "select max(createdDate) from CartoonCharacterEntity"),
		@NamedQuery(name = "findByNameAndCountryAndGenderAndAuthor", query = "select cartoon from CartoonCharacterEntity cartoon where cartoon.name=:name and cartoon.country=:country and cartoon.gender=:gender and cartoon.author=:author "),
		@NamedQuery(name="findAuthorByName",query="select cartoon.author from CartoonCharacterEntity cartoon where name=:name "),@NamedQuery(name="findNameAndCountryByAuthor",query="select cartoon.name,cartoon.country from CartoonCharacterEntity cartoon where cartoon.author=:author")
		,@NamedQuery(name="findCreatedDateByAuthor",query="select cartoon.createdDate from CartoonCharacterEntity cartoon where cartoon.author=:author "),
	@NamedQuery(name="updateAuthorByName",query="update CartoonCharacterEntity cartoon set cartoon.author=:author where cartoon.name=:name "),@NamedQuery(name="updateTypeByName",query="update CartoonCharacterEntity cartoon set cartoon.type=:type where cartoon.name=:name ")
		,@NamedQuery(name="deleteByName",query="delete from CartoonCharacterEntity cartoon where name=:name ")})
public class CartoonCharacterEntity extends CartoonCharacterParentEntity implements Serializable {
	@GenericGenerator(name = "manoj", strategy = "increment")
	@GeneratedValue(generator = "manoj")
	@Id
	private Integer id;
	private String name;
	private String country;
	private String gender;
	private String type;
	private String author;

	public CartoonCharacterEntity(String name, String country, String gender, String type, String author,
			String createdBy, String updatedBy, LocalDateTime createdDate, LocalDateTime updatedDate) {
		super(createdBy, updatedBy, createdDate, updatedDate);

		this.name = name;
		this.country = country;
		this.gender = gender;
		this.type = type;
		this.author = author;
	}

}
