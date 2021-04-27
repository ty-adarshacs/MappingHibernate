package com.tyss.hibernate.bean.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
	@Id
	@Column
	private int hid;
	@Column
	private String hname;
	 @OneToMany(cascade = CascadeType.ALL,mappedBy = "hospital")
	List<Hitems> hitems;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public List<Hitems> getHitems() {
		return hitems;
	}

	public void setHitems(List<Hitems> hitems) {
		this.hitems = hitems;
	}
	

}
