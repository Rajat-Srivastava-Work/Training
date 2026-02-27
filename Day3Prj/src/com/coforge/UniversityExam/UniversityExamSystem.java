package com.coforge.UniversityExam;

public class UniversityExamSystem {
	public static void main(String[] args) {
		Student s1 = new Student("S101","Rajat",80);
		Student s2 = new Student("S102","Mayank",90);
		
		ExamProcess mt = new MidtermExams();
		ExamProcess lb = new LabExam();
		
		System.out.println("MIDTERM EXAMS");
		mt.conductExamProcess(s1);
		
		System.out.println("LAB EXAMS");
		lb.conductExamProcess(s2);
		
	}
	

}
