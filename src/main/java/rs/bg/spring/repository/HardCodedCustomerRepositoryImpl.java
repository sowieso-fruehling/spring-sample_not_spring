package rs.bg.spring.repository;

import java.util.ArrayList;
import java.util.List;

import rs.bg.spring.model.Customer;

public class HardCodedCustomerRepositoryImpl implements CustomerRepository {

	
	/* (non-Javadoc)
	 * @see rs.bg.spring.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll()
	{
		List<Customer> customers=new ArrayList<>();
		
		//hard coded
		Customer currentCust=new Customer();
		currentCust.setName("John");
		currentCust.setSurname("Smith");
		customers.add(currentCust);
		
		return customers;
	}
}
