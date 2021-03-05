package com.test.rewardscalculator.controller;

import org.springframework.http.HttpStatus;

public class RewardsApiException extends Exception {
    private HttpStatus status;
    private String errorMessage;

    public RewardsApiException(String message, HttpStatus status) {
        super(message);
        this.status = status;
        this.errorMessage = message;
    }
}
