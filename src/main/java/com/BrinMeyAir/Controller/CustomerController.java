package com.BrinMeyAir.Controller;

import com.BrinMeyAir.Entity.Customer;
import com.BrinMeyAir.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerController {

    @Autowired
    private CustomerService serv;

    @GetMapping("/customer")
    public List<Customer> getAllCustomers() {
        return this.serv.getAllCustomers();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable String id) {
        return this.serv.getCustomerById(Integer.parseInt(id));
    }

    @GetMapping("/customer/{order}")
    public Customer getCustomerByOrder(@PathVariable String order) {
        return this.serv.getCustomerByOrder(Integer.parseInt(order));
    }

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return this.serv.addCustomer(customer);
    }

    @PutMapping("/customer")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return this.serv.updateCustomer(customer);
    }

    @DeleteMapping("/customer/{id}")
    public void deleteCustomer(@PathVariable String id) {
        this.serv.deleteCustomer(Integer.parseInt(id));
    }
}
