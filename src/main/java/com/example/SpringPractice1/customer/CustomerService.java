package com.example.SpringPractice1.customer;

import com.example.SpringPractice1.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    Customer getCustomer(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(()->new NotFoundException(
                        "Customer with id " + id + " not found"));
    }

    public List<Customer> getCustomers() {
        return this.customerRepository.findAll();
    }
}
