package com.app.spring.location.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "locTab")
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	Long locId;
	
	@Column(name = "code")
	Long locCode;
	
	@Column(name = "name")
	String locName;
	
	@Column(name="type")
	String locType;
}
