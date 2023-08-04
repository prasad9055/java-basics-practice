package com.java.basics;

public record Student(int studentId,String studentName,String studentDept , int studentScore) {
       
	static int level ;
	public Student {
		if(studentScore >=90 && studentScore<=100 )
			level=1;
		else if(studentScore <= 89 &&studentScore>=80)
			level=2;
		else if (studentScore<=79 && studentScore >=70)
			level = 3;
		else
			level=4;
		
	}
}
