package com.zensar.training.ui;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import com.zensar.training.bean.Customer;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;

public class Main9 {

	public static void main(String[] args) throws FileNotFoundException {
		
		RandomAccessFile accessFile = new RandomAccessFile("employees.dat", "rw");
		List<Employee> employees = new LinkedList<>();
		
		while (true) {
			try {
				int Id = accessFile.readInt();
				String name = accessFile.readUTF();
				char grade = accessFile.readChar();
				String hiredDate = accessFile.readUTF();
				LocalDate doj = LocalDate.parse(hiredDate);
				Double Basicsalary = accessFile.readDouble();
				String gender = accessFile.readUTF();
				Gender empgender;
				
				if (gender.equals("MALE"))
					empgender = Gender.MALE;
				else
					empgender = Gender.FEMALE;
				Employee employee = new Employee(Id, name, grade, doj, grade, empgender);
				//System.out.println(
						//Id + "," + name + "," + grade + "," + hiredDate + "," + Basicsalary + "," + gender + ",");

				employees.add(employee);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(employees);
				return;
			}
		}

	}

}
