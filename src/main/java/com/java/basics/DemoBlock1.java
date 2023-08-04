package com.java.basics;

public class DemoBlock1 {

	public void demoMethod() {
		System.out.println("Method...");
	}
	public DemoBlock1() {
		System.out.println("Constructor..");
	}{
		System.out.println("instance block");
	}
	static {
		System.out.println("Static block...");
	}
	public static void main(String[] args) {
		DemoBlock1 dm = new DemoBlock1();
		dm.demoMethod();
	}
}
