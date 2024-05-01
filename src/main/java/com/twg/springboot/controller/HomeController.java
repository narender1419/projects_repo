package com.twg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.twg.sprinboot.entity.Customer;
import com.twg.springboot.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/insertCustomer")
		public String insertCustomer(Model model)
		{
	    	Customer customer =new Customer();
	    	customer.setName("Rakesh");
	    	customer.setPlans("family");
	    	customer.setNomini("Arjun");
	    	customer.setYear(3);
			
	    	Customer cst=customerService.saveCustomer(customer);
			
		
			String msg="Customer"+cst.getName()+"with id"+cst.getId()+"is saved successfuly";
			model.addAttribute("Customer",cst);
			model.addAttribute("message",msg);
			return "home";
		}


	@PutMapping("/updateCustomer/{customerId}")
	    public String updateCustomer(@PathVariable Long customerId, @RequestBody Customer updatedCustomer) {
	        // Logic to update the customer with the provided customerId using the data in updatedCustomer
		   
		   Customer existingCustomer = customerService.findById(customerId);
		   if (existingCustomer != null) {
		        // Update the existing customer with data from updatedCustomer
		        existingCustomer.setName(updatedCustomer.getName());
		        existingCustomer.setPlans(updatedCustomer.getPlans());
		        existingCustomer.setNomini(updatedCustomer.getNomini());
		        existingCustomer.setYear(updatedCustomer.getYear());
		        
		        // Save the updated customer back to the database
		        customerService.saveCustomer(existingCustomer);
		        
		        // Redirect to the home page or any other appropriate page
		        return "redirect:/home";
		    } else {
		        
		        return "errorPage"; 
		    }
	}
	@GetMapping("/customer/{customerId}")
      public String getCustomerById(@PathVariable Long customerId, Model model) {
    // Retrieve the customer from the database using the customerId
    Customer customer = customerService.findById(customerId);
    
    if (customer != null) {
        // Add the customer to the model
        model.addAttribute("customer", customer);
        
        return "customerDetails"; // Assuming there's a view called customerDetails.html
    } else {
        
        return "errorPage"; 
    }
	}
	}
