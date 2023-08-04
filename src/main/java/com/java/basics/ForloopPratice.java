package com.java.basics;

public class ForloopPratice {
public static void main(String[] args) {
	int i ;
	for(i=1;i<6;i++) {
		System.out.print(i+" ");
		if(i>3)
			continue;
		System.out.print(i+" ");
		
	}
	System.out.print(i+" ");
	
	
	
	System.out.println("Second Program ");
	
	for(int j=0 ; j < 10 ; j++) {
		if(j % 2==0) {
			System.out.print(j+" ");
			continue;
		}
		System.out.print(j+" ");
	}
	
	
	System.out.println("3rd Program ");
	int k ;
	for(k=1; k<=12; k+=2) {
		if(k==8){
			System.out.println(k);
			break;
		}
	}
	System.out.println("3rd Program Executed");
	
	
	
	
	
	
}

}
