package com.test.rewardscalculator.processor;

import com.test.rewardscalculator.model.MonthlyRewards;
import com.test.rewardscalculator.model.Transaction;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class RewardsCalculator {
    private static final Integer SILVER_REWARD_POINTS = 1;
    private static final Integer GOLD_REWARD_POINTS = 2;


    /**
     * Calculated total rewards obtained for the provided transactions
     *
     * @param transactions list of transactions
     * @return
     */
    public Integer calculateTotalRewards(List<Transaction> transactions) {
        Integer totalRewards = transactions.stream()
                .map(this::calculateRewardPointsPerTransaction)
                .collect(Collectors.summingInt(Integer::intValue));

        return totalRewards;

    }

    /**
     * calculated rewards by each month.
     *
     * @param transactions list of transactions.
     * @return
     */
    public List<MonthlyRewards> calculateMonthlyRewards(List<Transaction> transactions) {

        List<MonthlyRewards> monthlyRewards = new ArrayList<>();
        Map<String, List<Transaction>> transactionsByMonth = categorizeTransactionByMonth(transactions);

        for (String month : transactionsByMonth.keySet()) {
            MonthlyRewards monthlyReward = new MonthlyRewards(month,
                    calculateTotalRewards(transactionsByMonth.get(month)));
            monthlyRewards.add(monthlyReward);
        }
        return monthlyRewards;
    }

    private Map<String, List<Transaction>> categorizeTransactionByMonth(List<Transaction> transactions) {
        Map<String, List<Transaction>> transactionsByMonth = new HashMap<>();
        for (Transaction transaction : transactions) {
            LocalDate transactionDate = LocalDate.parse(transaction.getDate());
            String transactionMonth = transactionDate.getMonth().toString();

            //If map contains the month then get existing transaction list and add this there. else add to map newly
            if (transactionsByMonth.containsKey(transactionMonth)) {
                transactionsByMonth.get(transactionMonth).add(transaction);
            } else {
                List<Transaction> transactionList = new ArrayList<>();
                transactionList.add(transaction);
                transactionsByMonth.put(transactionMonth, transactionList);
            }
        }

        return transactionsByMonth;
    }

    private Integer calculateRewardPointsPerTransaction(Transaction transaction) {
        //transactions below 50 are not eligible for rewards.
        Integer transactionValue = transaction.getValue();
        if (50 > transactionValue) {
            return 0;
        }
        //If transaction is between 50 and 100 then it is eligible for silver rewards, i.e 1 point
        if (100 < transactionValue) {
            return (transactionValue - 50) * SILVER_REWARD_POINTS;
        }

        //If transaction is above 100, then the customer gets 50 points for having above 100 transaction,
        // and 2 points for every dollar above 100.

        return 50 + (transactionValue - 100) * GOLD_REWARD_POINTS;
    }

}
