package com.java.basics;

public class DemoBloks2 {
	
	private DemoBloks2(int i) {
		System.out.println(i);
	}
	
	public static DemoBloks2() {
		System.out.println(100);
	}
	
	public static void main(String[] args) {
		DemoBloks2 dm = new DemoBloks2(200);
	}

}
