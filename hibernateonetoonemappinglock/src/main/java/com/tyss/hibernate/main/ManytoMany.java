package com.tyss.hibernate.main;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.hibernate.bean.Custermer;
import com.tyss.hibernate.bean.Shop;

public class ManytoMany {
	public void manytomany() {
		EntityManagerFactory entitymanagefactory=null;
		EntityManager entitymanager=null;
		EntityTransaction entitytransion=null;
		Custermer cutomer1=new Custermer();
		cutomer1.setCuid(1000);
		cutomer1.setCuname("raj");
		Custermer cutomer2=new Custermer();
		cutomer2.setCuid(2000);
		cutomer2.setCuname("Mraj");
		 ArrayList<Custermer  > arraycusto=new ArrayList();
		 arraycusto.add(cutomer1);
		 arraycusto.add(cutomer2);
		
		Shop shpo1=new Shop();
		shpo1.setId(100);
		shpo1.setName("shahaz");
		Shop shpo2=new Shop();
		shpo2.setId(200);
		shpo2.setName("NMM");
		
		
		
		ArrayList<Shop > arrayshpo1=new ArrayList();
		 arrayshpo1.add(shpo1);
		 arrayshpo1.add(shpo2);
		 
		
		 shpo1.setCustomer(arraycusto);
		 shpo2.setCustomer(arraycusto);
		 //arraycusto.addAll(arraycusto);
		
		
		try {
			 entitymanagefactory=Persistence.createEntityManagerFactory("adarshacs");
			 entitymanager=entitymanagefactory.createEntityManager();
			 entitytransion=entitymanager.getTransaction();
			 //entitytransion.begin();
			Shop qu= entitymanager.find(Shop.class, 100);
			System.out.println(qu.getName());
			System.out.println("  ji");
			System.out.println(qu.getCustomer());
			//List<Custermer> c= qu.getCustomer();
			
			
			//System.out.println(((Custermer) c).getCuname()+" customer");
			
//			
	//	entitymanager.persist(arraycusto);
//			 entitymanager.persist(shpo1);
//			 entitytransion.commit();
//			
		}catch(Exception e) {
			e.getStackTrace();
		}
		System.out.println("-------------------------------------------------------------------------");
		
	}
	public static void main(String[] args) {
		
		EntityManagerFactory entitymanagefactory=null;
		EntityManager entitymanager=null;
		EntityTransaction entitytransion=null;
		Custermer cutomer1=new Custermer();
		cutomer1.setCuid(1000);
		cutomer1.setCuname("raj");
		Custermer cutomer2=new Custermer();
		cutomer2.setCuid(2000);
		cutomer2.setCuname("Mraj");
		 ArrayList<Custermer  > arraycusto=new ArrayList();
		 arraycusto.add(cutomer1);
		 arraycusto.add(cutomer2);
		
		Shop shpo1=new Shop();
		shpo1.setId(100);
		shpo1.setName("shahaz");
		Shop shpo2=new Shop();
		shpo2.setId(200);
		shpo2.setName("NMM");
		
		
		
		ArrayList<Shop > arrayshpo1=new ArrayList();
		 arrayshpo1.add(shpo1);
		 arrayshpo1.add(shpo2);
		 
		
		 shpo1.setCustomer(arraycusto);
		 shpo2.setCustomer(arraycusto);
		 //arraycusto.addAll(arraycusto);
		
		
		try {
			 entitymanagefactory=Persistence.createEntityManagerFactory("adarshacs");
			 entitymanager=entitymanagefactory.createEntityManager();
			 entitytransion=entitymanager.getTransaction();
			 //entitytransion.begin();
			Shop qu= entitymanager.find(Shop.class, 100);
			System.out.println(qu.getName());
			System.out.println("  ji");
			System.out.println(qu.getCustomer());
			//List<Custermer> c= qu.getCustomer();
			
			
			//System.out.println(((Custermer) c).getCuname()+" customer");
			
//			
	//	entitymanager.persist(arraycusto);
//			 entitymanager.persist(shpo1);
//			 entitytransion.commit();
//			
		}catch(Exception e) {
			e.getStackTrace();
		}
	}

}
