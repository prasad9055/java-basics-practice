package com.java.basics;

public class ExceptionClass {
	
	public void startup() {
		try {
			System.out.println("try Block");
			throw new Exception();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Catch Block");
			System.exit(0);
		}finally {
			System.out.println("finally block");
		}
	}

	public static void main(String[] args) {
		new ExceptionClass().startup();
	}
}
