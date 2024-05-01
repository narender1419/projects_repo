package com.twg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twg.sprinboot.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{


}
