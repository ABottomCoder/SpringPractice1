package com.example.SpringPractice1.customer;

import org.springframework.stereotype.Repository;

import java.util.List;

public interface CustomerRepo {
    List<Customer> getCustomers();
}
