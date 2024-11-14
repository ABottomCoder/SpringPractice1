package com.example.SpringPractice1.customer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerServiceTest {

    @Autowired
    private CustomerRepository customerRepository;

    private CustomerService underTest;

    @BeforeEach
    void setUp() {
        underTest = new CustomerService(customerRepository);
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void getCustomer() {
        Customer rin = new Customer(
                1L,
                "rin",
                "hello",
                "rin@gmial.com"
                );

        Customer holo = new Customer(
                2L,
                "holo",
                "hello",
                "holo@gmial.com"
        );

        customerRepository.saveAll(Arrays.asList(rin, holo));

        List<Customer> customers = underTest.getCustomers();

        assertEquals(2, customers.size());
    }

    @Test
    void getCustomers() {
        // given
        Customer rin = new Customer(
                1L,
                "rin",
                "hello",
                "rin@gmial.com"
        );

        // when
        customerRepository.save(rin);

        // then
        Customer actual = underTest.getCustomer(1L);
        assertEquals(1L, actual.getId());
        assertEquals("rin", actual.getName());
        assertEquals("rin@gmial.com", actual.getEmail());
    }
}