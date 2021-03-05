package com.test.rewardscalculator.model;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class Transaction implements Serializable {

    private String date;
    private Integer value;

    public Transaction() {

    }

    public Transaction(String date, Integer value) {
        this.date = date;
        this.value = value;
    }
}
