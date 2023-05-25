package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Customer;

public interface CustomerService {
	List<Customer> getAllCustomers();
	
	Customer saveCustomer(Customer customer);
	
	Customer getCustomerById(Long id);
	
	Customer updateCustomer(Customer customer);
	
	void deleteCustomerById(Long id);
}
