package com.java.basics;

public class Branch extends ABCBank{
    Branch(){
    	super("ABC Bank - ECity");
    }
    public static void main(String[] args) {
		ABCBank bank = new Branch();
		System.out.println(bank.getBankBranchName());
	}
}
