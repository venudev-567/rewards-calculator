package com.test.rewardscalculator.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.rewardscalculator.model.Customer;
import com.test.rewardscalculator.model.CustomerRewards;
import com.test.rewardscalculator.model.CustomerTransactionsAcquirer;
import com.test.rewardscalculator.model.MonthlyRewards;
import com.test.rewardscalculator.model.Transaction;
import com.test.rewardscalculator.processor.RewardsCalculator;

@RestController
@RequestMapping("/rewards")
public class RewardsController {

    private CustomerTransactionsAcquirer customerTransactionsAcquirer;

    private RewardsCalculator rewardsCalculator;

    @Autowired
    public RewardsController(
            CustomerTransactionsAcquirer customerTransactionsAcquirer,
            RewardsCalculator rewardsCalculator) {
        this.customerTransactionsAcquirer = customerTransactionsAcquirer;
        this.rewardsCalculator = rewardsCalculator;
    }

    /**
     * Gets rewards details for all customers
     *
     * @return
     */
    @GetMapping
    public List<CustomerRewards> getRewardsForAllCustomers() {
        List<Customer> customers = customerTransactionsAcquirer.acquireAllCustomersTransactions();
        List<CustomerRewards> allCustomerRewards = customers.stream().map(customer -> getCustomerRewards(customer))
                .collect(Collectors.toList());
        return allCustomerRewards;
    }

    /**
     * Gets rewards details for specified customer.
     *
     * @param customerId
     * @return
     * @throws RewardsApiException
     */
    @GetMapping("{customerId}")
    public CustomerRewards getRewardsByCustomer(@PathVariable String customerId) throws RewardsApiException {
        List<Customer> customers = customerTransactionsAcquirer.acquireAllCustomersTransactions();
        Optional<Customer> retrievedCustomer = customers.stream().filter(customer -> customerId.equals(customer.getCustomerId()))
                .findFirst();
        if (retrievedCustomer.isPresent()) {
            return getCustomerRewards(retrievedCustomer.get());
        } else {
            throw new RewardsApiException("Customer Not Found", HttpStatus.NOT_FOUND);
        }
    }

    private CustomerRewards getCustomerRewards(Customer customer) {
        List<Transaction> transactions = customer.getTransactions();
        Integer totalRewardsObtained = rewardsCalculator.calculateTotalRewards(transactions);
        List<MonthlyRewards> monthlyRewards = rewardsCalculator.calculateMonthlyRewards(transactions);

        return new CustomerRewards(customer.getCustomerId(), customer.getFirstName(), customer.getLastName(),
                totalRewardsObtained, monthlyRewards);
    }

}
