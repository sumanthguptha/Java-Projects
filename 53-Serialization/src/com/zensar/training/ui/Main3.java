package com.zensar.training.ui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.time.LocalDate;

import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;

public class Main3 {

	public static void main(String[] args) throws IOException {
		Employee employee=new Employee(121, "sumanth", 'A', LocalDate.now() , 15000, Gender.MALE);

		OutputStream os = new FileOutputStream("employee.dat");
		ObjectOutputStream oos;
		oos = new ObjectOutputStream(os);

		oos.writeObject(employee);

		oos.flush();
		oos.close();
		os.close();

	}
}