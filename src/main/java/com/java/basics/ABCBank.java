package com.java.basics;

public abstract class ABCBank {

	private String bankName ;
	ABCBank(String bankName){
		this.bankName=bankName;
	}
	
	public String getBankBranchName() {
		return bankName;
	}
}
