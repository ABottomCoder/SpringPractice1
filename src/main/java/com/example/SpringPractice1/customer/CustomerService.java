package com.example.SpringPractice1.customer;

import org.springframework.stereotype.Component;

@Component
public class CustomerService {
    Customer getCustomer(){
        return new Customer(1L, "Rin Fate");
    }
}
