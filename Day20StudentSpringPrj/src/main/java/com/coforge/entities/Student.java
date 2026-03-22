package com.coforge.entities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long sid;
	private String sname;
	private double marks;
	private String mobile;
	
	@Transient
	private DateFormat dob;
	
	private Date dateOfBirth;
	
	public Student(String sname, double marks, String mobile) {
		super();
		this.sname = sname;
		this.marks = marks;
		this.mobile = mobile;
	}
	
	public void setDob(String dobInput) {
		try {
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			sdf.setLenient(false);
			
			Date parsedDate=sdf.parse(dobInput);
			
			this.dateOfBirth=parsedDate;
			this.dob=sdf;
		} catch(ParseException e) {
			throw new IllegalArgumentException("Invalid date format!!");
		}
	}
	
	public String getDob() {
		if(dateOfBirth==null) return null;
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		return sdf.format(dateOfBirth);
	}
	
}
