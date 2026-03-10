package com.coforge.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class Customer {
	private long custId;
	private String custName;
	private String address;
	private String mobile;
	private String email;
	
}
