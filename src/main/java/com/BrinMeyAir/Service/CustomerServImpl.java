package com.BrinMeyAir.Service;

import com.BrinMeyAir.Dao.CustomerDao;
import com.BrinMeyAir.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServImpl implements CustomerService{
    @Autowired
    private CustomerDao dao;

    @Override
    public List<Customer> getAllCustomers() {
        return this.dao.findAll();
    }

    @Override
    public Customer getCustomerById(int id) {
        Optional<Customer> optional = this.dao.findById(id);
        Customer customer = null;
        if (optional.isPresent()) {
            customer = optional.get();
        } else {
            throw new RuntimeException("Couldn't find customer with that ID");
        }
        return customer;
    }

    @Override
    public Customer getCustomerByOrder(int id) {
        List<Customer> customers = this.dao.findAll();
        Customer customer = null;
        for (Customer cust: customers) {
            if (cust.getOrderList().contains(id)) {
                customer = cust;
                break;
            }
        }
        if (customer == null) {
            throw new RuntimeException("Couldn't find customer with that Tracking Number");
        }
        return customer;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return this.dao.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return this.dao.save(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        this.dao.deleteById(id);
    }
}
