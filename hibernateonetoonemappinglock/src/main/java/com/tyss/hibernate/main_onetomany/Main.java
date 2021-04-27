package com.tyss.hibernate.main_onetomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernate.bean.onetomany.Hitems;
import com.tyss.hibernate.bean.onetomany.Hospital;

public class Main {
	public void onetomanymapping() {

		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction entitytranstion = null;

		Hitems hitem1 = new Hitems();
		hitem1.setHoid(10);
		hitem1.setHoname("knife");

		Hitems hitem2 = new Hitems();
		hitem2.setHoid(20);
		hitem2.setHoname("blade");

		Hitems hitem3 = new Hitems();
		hitem3.setHoid(30);
		hitem3.setHoname("cutter");

		ArrayList<Hitems> Hitems = new ArrayList<Hitems>();
		Hitems.add(hitem1);
		Hitems.add(hitem2);
		Hitems.add(hitem3);

		Hospital hospital = new Hospital();
		hospital.setHid(100);
		hospital.setHname("manipal");
		hitem1.setHospital(hospital);
		hitem2.setHospital(hospital);
		hitem2.setHospital(hospital);
		hospital.setHitems(Hitems);

		try {

			entitymanagerfactory = Persistence.createEntityManagerFactory("adarshacs");
			entitymanager = entitymanagerfactory.createEntityManager();
			entitytranstion = entitymanager.getTransaction();
			entitytranstion.begin();
			entitymanager.persist(hospital);
			entitytranstion.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------------------------------");
		
	}
	public static void main(String[] args) {

		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction entitytranstion = null;

		Hitems hitem1 = new Hitems();
		hitem1.setHoid(10);
		hitem1.setHoname("knife");

		Hitems hitem2 = new Hitems();
		hitem2.setHoid(20);
		hitem2.setHoname("blade");

		Hitems hitem3 = new Hitems();
		hitem3.setHoid(30);
		hitem3.setHoname("cutter");

		ArrayList<Hitems> Hitems = new ArrayList<Hitems>();
		Hitems.add(hitem1);
		Hitems.add(hitem2);
		Hitems.add(hitem3);

		Hospital hospital = new Hospital();
		hospital.setHid(100);
		hospital.setHname("manipal");
		hitem1.setHospital(hospital);
		hitem2.setHospital(hospital);
		hitem2.setHospital(hospital);
		hospital.setHitems(Hitems);

		try {

			entitymanagerfactory = Persistence.createEntityManagerFactory("adarshacs");
			entitymanager = entitymanagerfactory.createEntityManager();
			entitytranstion = entitymanager.getTransaction();
			entitytranstion.begin();
			entitymanager.persist(hospital);
			entitytranstion.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
