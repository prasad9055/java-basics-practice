package com.java.basics;

public class TesterClass {
	static int x=19;
	public TesterClass() {
		System.out.println("value of x:" + this.x);
		TesterClass1();
		
	}
	public static void TesterClass1() {
		System.out.println(this.x);
	}
	
	public static void main(String[] args) {
		new TesterClass();
	}

}
