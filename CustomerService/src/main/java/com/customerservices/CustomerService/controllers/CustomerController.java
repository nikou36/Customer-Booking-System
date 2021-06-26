package com.customerservices.CustomerService.controllers;

import com.customerservices.CustomerService.entities.Customer;
import com.customerservices.CustomerService.repositories.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customers")
    public List<Customer> all(){
       return customerRepository.findAll();
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable Long id){
       return customerRepository.findById(id).orElse(new Customer());
    }

    @PostMapping("/customers")
    public Customer newCustomer(@RequestBody Customer newCustomer){
        return customerRepository.save(newCustomer);
    }

    @PutMapping("/customers/{id}")
    public Customer replaceCustomer(@RequestBody Customer newCustomer, @PathVariable("id") Long id){
        newCustomer.setId(id);
        customerRepository.save(newCustomer);
        return newCustomer;
    }

    @DeleteMapping("/customers/{id}")
    public Long deleteCustomer(@PathVariable Long id){
        customerRepository.deleteById(id);
        return id;
    }



}
