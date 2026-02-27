package com.coforge.UniversityExam;

public class MidtermExams extends ExamProcess{
	MidtermExams() {
		super("MID101");
	}
	
	void conductExam(Student student) {
		System.out.println("Conducting Midterm Exam for " + student.studentName);
	}
	
	int evaluate(Student student) {
		System.out.println("Evaluate Midterm papers....");
		return 0;
	}
}
