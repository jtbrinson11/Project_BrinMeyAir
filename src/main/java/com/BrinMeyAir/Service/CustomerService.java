package com.BrinMeyAir.Service;

import com.BrinMeyAir.Entity.Customer;

import java.util.List;

public interface CustomerService{

    List<Customer> getAllCustomers();

    Customer getCustomerById(int id);

    Customer getCustomerByOrder(int order);

    Customer addCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    void deleteCustomer(int id);
}
