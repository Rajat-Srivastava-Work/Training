package com.coforge.UniversityExam;

public class LabExam extends ExamProcess{
	LabExam() {
		super("LAB203");
	}
	
	void conductExam(Student student) {
		System.out.println("Conducting Lab Practical for " + student.studentName);
	}
	
	int evaluate(Student student) { 
		System.out.println("Evaluating Lab Performance...");
		return 0;
	}
	
}
