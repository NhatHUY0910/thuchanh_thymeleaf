package com.practice_thymeleaf_4.service;

import com.practice_thymeleaf_4.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService {

    private static final Map<Integer, Customer> customers;

    static {
        customers = new HashMap<Integer, Customer>();
        customers.put(1, new Customer(1, "Duc", "ducthymeleaf@gmail.com", "Hue"));
        customers.put(2, new Customer(2, "Quy", "quythymeleaf@gmail.com", "Hue"));
        customers.put(3, new Customer(3, "Giang", "giangthymeleaf@gmail.com", "Da Nang"));
        customers.put(4, new Customer(4, "Hieu", "hieuthymeleaf@gmail.com", "Ha Noi"));
        customers.put(5, new Customer(5, "Quan", "quanthymeleaf@gmail.com", "Ha Loi"));
        customers.put(6, new Customer(6, "Khoa", "khoathymeleaf@gmail.com", "Ha Noi"));
    }

    @Override
    public List<Customer> getAllCustomers() {
        return new ArrayList<Customer>(customers.values());
    }

    @Override
    public void saveCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer getCustomerById(int id) {
        return customers.get(id);
    }

    @Override
    public void updateCustomer(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customers.remove(id);
    }
}
