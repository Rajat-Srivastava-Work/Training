package com.coforge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dao.CustomerDAO;
import com.coforge.entities.Customer;
import com.coforge.exception.CustomerNotFoundException;

@Service
public class CustomerService implements CustomerServiceInterface {
	
	@Autowired
	private CustomerDAO dao;
	
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.getAllCustomer();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.saveCustomer(customer);
	}

	@Override
	public Customer getCustomerById(long id) {
		// TODO Auto-generated method stub
		return dao.getCustomerById(id).orElseThrow(()->
		new CustomerNotFoundException());
	}

	@Override
	public Customer updateCustomer(Customer customer, long id) {
		// TODO Auto-generated method stub
		Optional<Customer> exCustomer=dao.getCustomerById(id);
		if(exCustomer!=null) {
			exCustomer.setCname(customer.getCname());
			exCustomer.setAddress(customer.getAddress());
			exCustomer.setMobile(customer.getMobile());
			exCustomer.setEmail(customer.getEmail());
			return dao.saveCustomer(exCustomer);
		}
		
		return null;
	}

	@Override
	public void deleteCustomer(long id) {
		// TODO Auto-generated method stub
		Customer exCustomer=dao.getCustomerById(id).orElseThrow(()->new RuntimeException());
		if(exCustomer!=null) {
			dao.deleteCustomer(id);
			System.out.println("customer delete successfully");
		} else {
			System.out.println("no customer with this id");
		}
	}

}
