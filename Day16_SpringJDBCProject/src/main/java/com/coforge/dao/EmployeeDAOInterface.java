package com.coforge.dao;

import java.util.List;
import com.coforge.entities.Employee;

public interface EmployeeDAOInterface {
	List<Employee> getAllEmployee();
	
	void insertEmployee(Employee employee);
	Employee getEmployeeById(long eid);
	
	void updateEmployee(long eid, Employee e);
	void deleteEmployee(long eid);
	
	
}
