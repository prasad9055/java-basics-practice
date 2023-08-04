package com.java.basics;

public class PreIncrement {

	public static void main(String[] args) {


		int a =0;
		int b=0;
		int c=0;
		
		int x=(++a +b--)*c++;
		int y=(++a +b--)*++c;
		System.out.println(x+" "+y);

	}

}
