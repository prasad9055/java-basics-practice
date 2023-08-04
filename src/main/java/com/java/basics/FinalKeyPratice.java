package com.java.basics;

public class FinalKeyPratice {
	public static void main(String[] args) {
		final int privatevalue ;
		privatevalue =20;
		int secValue =  privatevalue+20;
		privatevalue =secValue+30;
		System.out.println(privatevalue +" " + secValue);
	}

}
