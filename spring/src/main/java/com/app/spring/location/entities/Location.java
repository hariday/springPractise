package com.app.spring.location.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "loc_Tab")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Long locId;
	
	@Column(name = "code")
	private Long locCode;
	
	@Column(name = "name")
	private String locName;
	
	@Column(name="type")
	private	String locType;
}
