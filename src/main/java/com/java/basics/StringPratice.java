package com.java.basics;

public class StringPratice {

	public static boolean checkString() {
		String s1="Hello";
		String s2="Hello";
		if(s1==s2)
			return true;
		return false ;
	}
	public static boolean checkString1() {
		String s3= new String("Hello");
		String s4=new String("Hello");
		if(s3==s4)
			return true;
		return false ;
	}
	public static void main(String[] args) {
		System.out.println(checkString());
		System.out.println(checkString1());
		
	}
}
