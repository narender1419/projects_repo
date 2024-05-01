package com.twg.springboot.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.twg.sprinboot.entity.Customer;
import com.twg.springboot.repository.CustomerRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

	@Service
public class Customerserviceimp implements CustomerService {
	 
		
		@Autowired
		private CustomerRepository  customerRepository;
		@Override
		public Customer saveCustomer(Customer customer) {
			// TODO Auto-generated method stub
		
			
				return customerRepository.save(customer);
			
		}

		@Override
		public Customer updateCustomer(Customer customer) {
			// TODO Auto-generated method stub
			return customerRepository.save(customer);
		}

		@Override
		public void deleteCustomer(Customer customer) {
			// TODO Auto-generated method stub

		}

		@Override
		public Customer findById(long id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Customer> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

	}



