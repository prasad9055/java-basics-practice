package com.java.basics;

public class DemoBlocks {

	static int i = demo();
	
	static {
		System.out.println(i+" ");
	}
		
	DemoBlocks(){
		  System.out.println("Inside Constructor");
	}
	
	static int demo() {
		System.out.println("inside demo method");
		return 100;
	}
	
	public static void main(String[] args) {
		System.out.println("inside main Method");
	}
	
}
