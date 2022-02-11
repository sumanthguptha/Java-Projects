package com.zensar.training;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.Developer;
import com.zensar.training.util.HibernateUtil;

public class Main2 {
	
	static void insertTest() {
		Developer developer=new Developer();
		developer.setName("mani");
		developer.setCity("haryana");
		developer.addSkill("angular");
		developer.addSkill("HTML");
		developer.addSkill("CSS");
		developer.addSkill("React Js");
		developer.addSkill("node Js");
		
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		session.save(developer);
			
		tx.commit();

		HibernateUtil.cleanUp();
	}
	
	public static void main(String[] args) {
		insertTest();

	}

}
