package com.zensar.training.bean;

import java.util.Objects;

public class Student implements Comparable<Student> {
	
	int rollno;
	String name;
	String department;
	int mark;
	
	
	
	public Student(int rollno, String name, String department, int mark) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.department = department;
		this.mark = mark;
	}



	@Override
	public int hashCode() {
		return Objects.hash(department, mark, name, rollno);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(department, other.department) && mark == other.mark && Objects.equals(name, other.name)
				&& rollno == other.rollno;
	}



	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", department=" + department + ", mark=" + mark + "]";
	}

	@Override
	public int compareTo(Student o) {

		return 0;
	}

}
