package com.test.rewardscalculator.controller;

import com.test.rewardscalculator.model.Customer;
import com.test.rewardscalculator.model.CustomerTransactionsAcquirer;
import com.test.rewardscalculator.model.CustomerTransactionsGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/customers")
public class TestCustomerTranasctionsController {

    @Autowired
    private CustomerTransactionsAcquirer customerTransactionsAcquirer;
    @Autowired
    private CustomerTransactionsGenerator seeder;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerTransactionsAcquirer.acquireAllCustomersTransactions();
    }

    //This in general would be a post endpoint which takes in a requestbody to add customers/transactions.
    @GetMapping("/generate")
    public List<Customer> seedTransactions() {
        return seeder.generateNewData();
    }
}
