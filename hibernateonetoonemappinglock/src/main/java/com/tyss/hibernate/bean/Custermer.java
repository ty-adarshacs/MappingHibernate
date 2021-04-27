package com.tyss.hibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Custermer {
	@Id
	@Column
	private int cuid;
	@Column
	private String cuname;
	public int getCuid() {
		return cuid;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void setCuid(int cuid) {
		this.cuid = cuid;
	}
	public String getCuname() {
		return cuname;
	}
	public void setCuname(String cuname) {
		this.cuname = cuname;
	}
	

}
