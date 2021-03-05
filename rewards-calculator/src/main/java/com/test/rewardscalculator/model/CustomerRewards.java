package com.test.rewardscalculator.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class CustomerRewards implements Serializable {
    private static final long serialVersionUID = 1L;

    private String customerId;
    private String firstName;
    private String lastName;
    private Integer totalRewardPoints;
    private List<MonthlyRewards> monthlyRewards;

    public CustomerRewards(String customerId, String firstName, String lastName, Integer totalRewardPoints,
                           List<MonthlyRewards> monthlyRewards) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalRewardPoints = totalRewardPoints;
        this.monthlyRewards = monthlyRewards;
    }
}
