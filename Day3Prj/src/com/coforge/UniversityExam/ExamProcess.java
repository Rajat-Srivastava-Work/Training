package com.coforge.UniversityExam;

abstract class ExamProcess{
	static final int passMarks = 40;
	final String examCode;
	
	ExamProcess(String examCode) {
		this.examCode = examCode;
	}
	
	final void conductExamProcess(Student student) {
		if(!validateEligibility(student)) {
			System.out.println(student.studentName + " is NOT Eligible");
			return;
		}
		
		String hallTicket = allocateHallTicket(student);
		System.out.println("Hall Ticket Generated: " + hallTicket);
		
		conductExam(student);
		int marks = evaluate(student);
		publishResult(student, marks);
	}
	
	boolean validateEligibility(Student student) {
		return student.attendancePercent >= UniversityRules.minAttendance;		
	}
	
	String allocateHallTicket(Student student) {
		return UniversityRules.generateHallTicket();
	}
	
	abstract void conductExam(Student student);
	abstract int evaluate(Student student);
	
	final void publishResult(Student student, int marks) {
		if(marks >= passMarks) {
			System.out.println(student.studentName + " PASS with marks: " + marks);
		} else {
			System.out.println(student.studentName + " FAIL with marks: " + marks);
		}
	}
}
