package com.learn.spring.tuesday.task86.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.learn.spring.tuesday.task86.Model.Customer;
import com.learn.spring.tuesday.task86.Service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService cs;
	
	@GetMapping("/")
	public String home() {
		return "welcome to home page";
	}
	
	@GetMapping("/addcustomer")
	public String addCustomer(int id, String name, long mobile , String email) {
		cs.addCustomer(Customer.builder().id(id).name(name).mobile(mobile).email(email).build());
		return "Customer Added";
	}
	
	@GetMapping("/getcustomers")
	public String getAll() {
		Gson gson = new Gson();
		String json = gson.toJson(cs.getAll());
		return json;
	}
	
	@GetMapping("/deletecustomer")
	public String deleteCustomer(int id) {
		cs.deleteCustomer(id);
		return "Customer Delete";
	}

}
