package com.test.rewardscalculator.model;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class CustomerTransactionsGenerator {

    /**
     * generates data for new test. copy this data and replace it with the data in the resource file.
     *
     * @return
     */
    public List<Customer> generateNewData() {
        return generateTestData();
    }

    private List<Customer> generateTestData() {

        List<Customer> customers = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            String firstName = "Venu" + i;
            String lastName = "yella" + i;
            customers.add(new Customer(String.valueOf(i), firstName, lastName, generateFewTransactions()));
        }
        return customers;
    }

    //generates between 10 and 20 transactions per customer.
    private List<Transaction> generateFewTransactions() {
        int numberOfTransactions = ThreadLocalRandom.current().nextInt(10, 20);
        List<Transaction> transactions = new ArrayList<>();
        for (int i = 0; i < numberOfTransactions; i++) {
            transactions.add(new Transaction(generateTransactionDate(), generateTransactionAmount()));
        }

        return transactions;
    }

    private String generateTransactionDate() {
        //Transactions created for 90 day period.
        long maxTransactionPeriod = LocalDate.now().minusDays(90).toEpochDay();
        long today = LocalDate.now().toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(maxTransactionPeriod, today);
        return LocalDate.ofEpochDay(randomDay).toString();
    }

    private Integer generateTransactionAmount() {
        //generating an amount between 10 and 200 for test purpose.
        return ThreadLocalRandom.current().nextInt(10, 200);
    }
}
