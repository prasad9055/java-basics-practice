package com.java.basics;

public class RecordStudentClass {

	public static void main(String[] args) {
		
		Student s1 = new Student(111,"Alia","ETA" ,89);
		System.out.println(s1.studentId()+" "+s1.studentName()+" "+s1.studentDept()+""+s1.studentScore());
		System.out.println(""+Student.level);
		Student s2 = new Student(111,"Alia","ETA" ,89);
		
		System.out.println(" "+s1.equals(s2));

	}

}
