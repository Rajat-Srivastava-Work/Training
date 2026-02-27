package com.coforge.UniversityExam;

public class UniversityRules {
	static final String universityCode = "AKTU165";
	static final int minAttendance = 75;
	
	static int hallTicketCounter = 1000;
	
	static String generateHallTicket() {
		hallTicketCounter++;
		return universityCode + hallTicketCounter;
	}
}
