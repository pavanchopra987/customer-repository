package com.learn.spring.tuesday.task86.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.spring.tuesday.task86.Model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
