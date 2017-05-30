package rs.bg.spring.repository;

import java.util.List;

import rs.bg.spring.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}