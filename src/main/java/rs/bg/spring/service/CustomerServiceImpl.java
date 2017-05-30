package rs.bg.spring.service;

import java.util.List;

import rs.bg.spring.model.Customer;
import rs.bg.spring.repository.CustomerRepository;
import rs.bg.spring.repository.HardCodedCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository=new HardCodedCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see rs.bg.spring.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll()
	{
		return customerRepository.findAll();		
	}
}
