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
import lombok.ToString;

@Entity
@Table(name = "loc_Tab")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Long locId;
	
	@Column(name = "code")
	private String locCode;
	
	@Column(name = "name")
	private String locName;
	
	@Column(name="type")
	private	String locType;

	public Location() {
		super();
	}

	
	public Location(Long locId, String locCode, String locName, String locType) {
		super();
		this.locId = locId;
		this.locCode = locCode;
		this.locName = locName;
		this.locType = locType;
	}


	public Long getLocId() {
		return locId;
	}

	public void setLocId(Long locId) {
		this.locId = locId;
	}

	public String getLocCode() {
		return locCode;
	}

	public void setLocCode(String locCode) {
		this.locCode = locCode;
	}

	public String getLocName() {
		return locName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
	}

	public String getLocType() {
		return locType;
	}

	public void setLocType(String locType) {
		this.locType = locType;
	}

	@Override
	public String toString() {
		return "Location [locId=" + locId + ", locCode=" + locCode + ", locName=" + locName + ", locType=" + locType
				+ "]";
	}
	
	
	
}
