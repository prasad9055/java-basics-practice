package com.java.basics;

public class InterfaceAImpl implements InterfaceA{

	public static void main(String[] args) {
		InterfaceAImpl ifa = new InterfaceAImpl();
           ifa.m1();
	}

	 int x=20;
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println(x+" ");
      System.out.println("Hello ");		
	}

}
