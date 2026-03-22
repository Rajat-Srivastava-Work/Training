package com.coforge.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coforge.entities.Customer;
import com.coforge.repositories.CustomerRepository;

@Repository
public class CustomerDAO implements CustomerDaoInterface {
	
	@Autowired
	CustomerRepository repository;

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repository.save(customer);
	}

	@Override
	public Optional<Customer> getCustomerById(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Customer updateCustomer(Customer customer, long id) {
		// TODO Auto-generated method stub
		return repository.save(customer);
	}

	@Override
	public void deleteCustomer(long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}
