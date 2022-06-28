package com.learn.spring.tuesday.task86.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.spring.tuesday.task86.Model.Customer;
import com.learn.spring.tuesday.task86.Repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerrepo;
	
	public void addCustomer(Customer customer) {
		customerrepo.save(customer);
	}
	
	public List<Customer> getAll(){
		return customerrepo.findAll();
	}
	
	public void deleteCustomer(int id) {
		customerrepo.delete(Customer.builder().id(id).build());
	}
}
