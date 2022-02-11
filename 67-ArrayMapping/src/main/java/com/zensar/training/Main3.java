package com.zensar.training;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.Bill;
import com.zensar.training.bean.BillItem;
import com.zensar.training.util.HibernateUtil;

public class Main3 {

	public static void main(String[] args) {
		Bill bill=new Bill();
		bill.setCustomerName("Nani");
		bill.setBillDate(LocalDate.of(2021, 9, 4));
		
		BillItem billItem1=new BillItem();
		billItem1.setProductName("Pen");
		billItem1.setPrice(25.0);
		billItem1.setQuantity(3);
		
		BillItem billItem2=new BillItem();
		billItem2.setProductName("Pencil");
		billItem1.setPrice(10.0);
		billItem1.setQuantity(10);
		
		BillItem billItem3=new BillItem();
		billItem3.setProductName("Book");
		billItem3.setPrice(40.0);
		billItem3.setQuantity(6);
		
		bill.addBillItem(billItem1);
		bill.addBillItem(billItem2);
		bill.addBillItem(billItem3);
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		Transaction tx=session.beginTransaction();
		session.save(bill);
		tx.commit();
		
		HibernateUtil.cleanUp();
	}

}
