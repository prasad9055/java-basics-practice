package com.java.basics;

public class TesterAssertion {
public static void main(String[] args) {
	int count =0;
	try {
		count +=100;
		assert count - 100 < 100 :count +=100;
	} catch (Error e) {
		// TODO: handle exception
		count -= 100;
	}
	System.out.println(count);
}
}
