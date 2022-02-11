package com.zensar.training;

import com.zensar.training.bean.Product;
import com.zensar.training.util.HibernateUtil;

public class Main1 {

	public static void main(String[] args) {

		insertTesting();
		// loadTesting(2);

		// loadAllTesting();

		// updateTesting(1);
		// deleteTesting(2);

	}

	private static void insertTesting() {
		Product product = new Product();
		product.setId(159);
		product.setName("strawberry");
		product.setDiscount(0, 7);
		product.setDiscount(1, 15);
		product.setDiscount(2, 25);
		product.setDiscount(3, 50);

		
		
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();

		Integer genId = (Integer) session.save(product);

		transaction.commit();

		System.out.println("Product Object Saved with ID " + genId);
	}
}