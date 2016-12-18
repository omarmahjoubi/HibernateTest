package com.omar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personne")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id ;
	
	@Column(name = "name")
	private String name ; 
	
	@Column(name = "adress")
	private String adress ;

	public Person(String name,String adress) {
		this.name=name ;
		this.adress=adress;
	}
	
	
	@Override
	public String toString() {
		return "name : "+ name + ", adress : " +  adress + ".";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
}
