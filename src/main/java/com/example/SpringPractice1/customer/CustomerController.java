package com.example.SpringPractice1.customer;

import com.example.SpringPractice1.SpringPractice1Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    Customer getCustomer() {
        return customerService.getCustomer();
    }


}
