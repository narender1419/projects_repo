package com.twg.springboot.service;


import java.util.List;

import com.twg.sprinboot.entity.Customer;

public interface CustomerService {
	
	

		      public Customer saveCustomer(Customer customer);
		      public Customer updateCustomer(Customer customer);  
			  public void deleteCustomer(Customer customer);
			  public Customer findById(long id);
			  public List<Customer>findAll();


}
