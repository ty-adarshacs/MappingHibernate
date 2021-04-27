package com.tyss.hibernate.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.tyss.hibernate.bean.College;
import com.tyss.hibernate.bean.School;

public class Pesrsisting {
	public static void main(String[] args) {
		EntityManagerFactory entitymanagefactory=null;
		EntityManager entitymanager=null;
		EntityTransaction entitytransion=null;
		
//		College college=new College();
//		college.setCid(1);
//		college.setCname("geck");
//		college.setLocation("krpete");
		School school=new School();
		school.setSid(3);
		school.setSname("vivekananda");
		school.setSloc("bannur");
		//school.setCollege(college);
		
		try {
			
			 entitymanagefactory=Persistence.createEntityManagerFactory("lockk");
			 entitymanager=entitymanagefactory.createEntityManager();
			 entitytransion=entitymanager.getTransaction();
			 entitytransion.begin();
			 entitymanager.persist(school);
			// entitymanager.persist( school);
			 entitytransion.commit();
//			School s= entitymanager.find(School.class, 1);
//			System.out.println(s.getSname());
		}catch(Exception e) {
			e.getStackTrace();
		}
	}

}
