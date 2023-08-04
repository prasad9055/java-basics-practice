package com.java.basics;

import java.util.ArrayList;
import java.util.List;

public class QuestionSet {
	public static void main(String[] args) {
		QuestionSet qs = new QuestionSet();
		List<Integer> set1 = new ArrayList<>();
		set1.add(70);
		set1.add(80);
		qs.m1(set1);
		
	}
	
	private void m1(List<?> set1) {
		m2(set1);
	}
	
	private <T> void m2(List<T> set1) {
		System.out.print(set1 +" ");
		set1.set(0, set1.get(1));
		System.out.print(set1);
	}

}
