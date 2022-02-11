package com.zensar.training.ui;

import com.zensar.training.bean.Student;

public class StudentClient {

	public static void main(String[] args) {
		Student student =new Student();
		student.name="Munna";
		student.mark=80;
		student.grade='A';
		
		System.out.println(student.toString());
		
		Student student1 =new Student();
		student.name="Ravi";
		student.mark=90;
		student1.grade='A';
		
		System.out.println(student.toString());
		
		student=null;
		System.gc();
		
	}

}
