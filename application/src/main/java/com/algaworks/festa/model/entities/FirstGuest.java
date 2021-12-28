package com.algaworks.festa.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "firstguests_my_guests")
public class FirstGuest implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "numberguests")
	private Integer numberGuests;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<SecondGuest> myGuests= new ArrayList<>();
	
	

	public FirstGuest() {
	}

	public FirstGuest(String name, Integer numberGuests ) {
		this.name = name;
		this.numberGuests = numberGuests;
	}
	
	public FirstGuest(Long id, String name, Integer numberGuests ) {
		this.name = name;
		this.id = id;
		this.numberGuests = numberGuests;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberGuests() {
		return numberGuests;
	}

	public void setNumberGuests(Integer numberGuests) {
		this.numberGuests = numberGuests;
	}

	public List<SecondGuest> getMyGuests() {
		return myGuests;
	}

	public void addMyGuests(SecondGuest myGuest) {
		myGuests.add(myGuest);
	}
	
	
	
	
		
	
}
