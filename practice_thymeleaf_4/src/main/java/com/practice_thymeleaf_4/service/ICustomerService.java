package com.practice_thymeleaf_4.service;

import com.practice_thymeleaf_4.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAllCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomerById(int id);

    void updateCustomer(int id, Customer customer);

    void deleteCustomer(int id);
}
