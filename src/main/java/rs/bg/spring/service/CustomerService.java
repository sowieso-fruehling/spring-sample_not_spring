package rs.bg.spring.service;

import java.util.List;

import rs.bg.spring.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

}