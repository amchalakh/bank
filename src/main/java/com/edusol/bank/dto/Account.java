package com.edusol.bank.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name="BankAccount")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="city")
	private String city;
	public Account() {
		super();
	}
	public Account(Long id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public Account(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String toString() {
		return String.format("Student [id=%s, name=%s, city=%s]", id, name, city);
	}
	

}
