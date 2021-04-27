package com.tyss.hibernate.bean.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Hitems {
	@Id
	@Column
	private int hoid;
	@Column
	private String honame;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hid")
	private Hospital hospital;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getHoid() {
		return hoid;
	}
	public void setHoid(int hoid) {
		this.hoid = hoid;
	}
	public String getHoname() {
		return honame;
	}
	public void setHoname(String honame) {
		this.honame = honame;
	}
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	
	

}
