package com.test.rewardscalculator.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class MonthlyRewards implements Serializable {
    private static final long serialVersionUID = 1L;

    private String month;
    private Integer rewardsValue;

    public MonthlyRewards(String month, Integer rewardsValue) {
        this.month = month;
        this.rewardsValue = rewardsValue;
    }
}
