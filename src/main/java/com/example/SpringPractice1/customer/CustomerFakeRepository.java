package com.example.SpringPractice1.customer;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements  CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Saber", "SaberPwd", "email@gmail.com"),
                new Customer(2L, "Archer", "ArcherPwd", "email@gmail.com")
        );
    }
}
