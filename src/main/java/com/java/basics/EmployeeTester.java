package com.java.basics;

public class EmployeeTester {

	public static void main(String[] args) {
		
		Employee e[] = new Employee[2];
		e[0] = new Employee(101, "Vijay");
		e[1]= new Employee(102, "Ajay");
		for(int i=0 ; i<e.length;i++) {
			System.out.println(e[i]);
		}

	}

}
