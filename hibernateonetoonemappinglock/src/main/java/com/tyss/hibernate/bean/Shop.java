package com.tyss.hibernate.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="shop")
public class Shop {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@ManyToMany(targetEntity = Custermer.class,cascade = CascadeType.ALL)
	
	@JoinTable(name="shop_customer",joinColumns=@JoinColumn(name="id"),inverseJoinColumns = @JoinColumn(name="cuid"))
	
	private List<Custermer> customer;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<Custermer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Custermer> customer) {
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	


}
