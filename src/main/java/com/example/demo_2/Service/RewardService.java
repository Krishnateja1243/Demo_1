package com.example.demo_2.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_2.model.Transaction;
import com.example.demo_2.repository.TransactionRepository;

@Service
public class RewardService {
    @Autowired
    private TransactionRepository transactionRepository;

    public RewardService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public int calculateRewardPoints(BigDecimal amount) {
        int points = 0;
        if (amount.compareTo(BigDecimal.valueOf(100)) > 0) {
            points += (amount.subtract(BigDecimal.valueOf(100))).intValue() * 2;
            amount = BigDecimal.valueOf(100);
        }
        if (amount.compareTo(BigDecimal.valueOf(50)) > 0) {
            points += (amount.subtract(BigDecimal.valueOf(50))).intValue();
        }
        return points;
    }

    public int getMonthlyRewardPoints(Long customerId, String startDate, String endDate) {
        List<Transaction> transactions =
                transactionRepository.findByCustomerIdAndTransactionDateBetween(customerId, startDate, endDate);
        return transactions.stream()
                .map(transaction -> calculateRewardPoints(transaction.getAmount()))
                .reduce(0, Integer::sum);
    }

    public int getTotalRewardPoints(Long customerId) {
        List<Transaction> transactions = transactionRepository.findByCustomerIdAndTransactionDateBetween(customerId, "1900-01-01", "9999-12-31");
        return transactions.stream()
                .map(transaction -> calculateRewardPoints(transaction.getAmount()))
                .reduce(0, Integer::sum);
    }
}
