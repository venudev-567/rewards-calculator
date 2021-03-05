package com.test.rewardscalculator.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    private String customerId;
    private String firstName;
    private String lastName;
    private List<Transaction> transactions;

    //this no-arg constructor is needed for json deserialization.
    public Customer() {

    }

    public Customer(String customerId, String firstName, String lastName,
                    List<Transaction> transactions) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.transactions = transactions;
    }
}
