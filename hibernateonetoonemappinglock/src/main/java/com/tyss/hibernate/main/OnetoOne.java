package com.tyss.hibernate.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernate.bean.College;
import com.tyss.hibernate.bean.School;

public class OnetoOne {
	public void onetoonemappinghibernate() {
		EntityManagerFactory entitymanagefactory=null;
		EntityManager entitymanager=null;
		EntityTransaction entitytransion=null;
		School scholl=new School();
		scholl.setSid(30);
		scholl.setSname("sara");
		scholl.setSloc("saligram");
		College c=new College();
		c.setCid(3);
		c.setCname("geck");
		c.setLocation("krpete");
		c.setSchool(scholl);
		scholl.setCollege(c);
		try {
			 entitymanagefactory=Persistence.createEntityManagerFactory("adarshacs");
			 entitymanager=entitymanagefactory.createEntityManager();
//			 entitytransion=entitymanager.getTransaction();
//			 entitytransion.begin();
			 School sss=entitymanager.find(School.class, 30);
			 College ccc=entitymanager.find(College.class, 3);
			
			 System.out.println( ccc.getSchool().getSid());
			 System.out.println(sss.getCollege().getCid());
//			 entitymanager.persist(c);
//			 entitymanager.persist(scholl);
//			 entitytransion.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("-------------------------------------------------------------------------");
	}
	

}
