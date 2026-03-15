package com.coforge.dao;

import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.coforge.entities.Employee;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class EmployeeDAO implements EmployeeDAOInterface{
	
	private final DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	EmployeeDAO(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Employee DAO bean created.@PostConstruct called");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Employee dao bean is being destroyed.@PreDestroy called");
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		String query="select * from emp_table";
		RowMapper<Employee> rowMapper=(row,rowNum)->{
			Employee e=new Employee();
			e.setEmpId(row.getLong("eid"));
			e.setEname(row.getString("ename"));
			e.setSalary(row.getDouble("salary"));
			return e;
		};
		return jdbcTemplate.query(query, rowMapper);
		
	}

	@Override
	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String query="insert into emp_table(eid,ename,salary) values(?,?,?)";
		jdbcTemplate.update(query,employee.getEmpId(),employee.getEname(),employee.getSalary());
		System.out.println("data inserted");
		
	}

	@Override
	public Employee getEmployeeById(long eid) {
		// TODO Auto-generated method stub
		String query="select * from emp_table where eid=?";
		RowMapper<Employee> rowMapper=(row,rowNum)->{
			Employee e=new Employee();
			e.setEmpId(row.getLong("eid"));
			e.setEname(row.getString("ename"));
			e.setSalary(row.getDouble("salary"));
			return e;
		};
		return jdbcTemplate.queryForObject(query, rowMapper,eid);
		
	}

	@Override
	public void updateEmployee(long eid, Employee e) {
		// TODO Auto-generated method stub
		String query="update emp_table set salary=? where eid=?";
		jdbcTemplate.update(query,e.getSalary(),e.getEmpId());
		System.out.println("record updated");
		
	}

	@Override
	public void deleteEmployee(long eid) {
		// TODO Auto-generated method stub
		String query="delete from emp_table where eid=?";
		jdbcTemplate.update(query,eid);
	    System.out.println("record deleted");
		
		
		
	}
	

}
