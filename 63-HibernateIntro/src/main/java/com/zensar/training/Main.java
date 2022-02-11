package com.zensar.training;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.zensar.training.bean.Contact;
import com.zensar.training.util.HibernateUtil;

public class Main 
	{
	static void insert() 
	{
		Contact contact=new Contact(1,"John", 25, "7396305328");
		Contact contact1=new Contact(2,"KCR", 60, "739630788");
		Contact contact2=new Contact(3,"Jagan", 35, "9839678328");
		Contact contact3=new Contact(4,"Revanth", 37, "845305328");
		Contact contact4=new Contact(5,"RGV", 40, "958305328");
		

		HibernateUtil.init();
		Session session =HibernateUtil.getSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(contact);
		session.save(contact1);
		session.save(contact2);
		session.save(contact3);
		session.save(contact4);
		
		tx.commit();

		System.out.println("Contact saved to DB");

		HibernateUtil.cleanUp();
		
		}
	
		static void read() {
			HibernateUtil.init();
			Session session =HibernateUtil.getSession();
				
			Contact contact=session.load(Contact.class, 1);
			System.out.println(contact);
			
			HibernateUtil.cleanUp();
			
		}
		
		static void readAll() {
			HibernateUtil.init();
			Session session =HibernateUtil.getSession();

			String str="from Contact";	//hibernate query language
			
			Query query =session.createQuery(str);
			List<Contact> allContacts=query.list();
			System.out.println(allContacts);
			
			session.close();
			HibernateUtil.cleanUp();
		}
		
		static void update() {
			HibernateUtil.init();
			Session session =HibernateUtil.getSession();
			
			Contact contact = session.load(Contact.class, 22);
			contact.setName(contact.getName().toUpperCase());
			contact.setAge(52);
			
			Transaction tx=session.beginTransaction();
			session.update(contact);
			
			tx.commit();
			
			HibernateUtil.cleanUp();
			
			
		}
		
		static void delete() {
			HibernateUtil.init();
			Session session =HibernateUtil.getSession();
			
			Contact contact = session.load(Contact.class, 22);
			Transaction tx=session.beginTransaction();
			session.delete(contact);
			
			tx.commit();
			
			HibernateUtil.cleanUp();
			
		}
		public static void main(String[] args) {
		
		//insert();
		//read();
		//readAll();
		//update();
		delete();
		
	}

}
