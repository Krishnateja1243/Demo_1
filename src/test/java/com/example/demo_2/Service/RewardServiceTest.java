package com.example.demo_2.Service;

import static org.mockito.ArgumentMatchers.anyString;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo_2.model.Transaction;
import com.example.demo_2.repository.TransactionRepository;

@SpringBootTest
public class RewardServiceTest {

    @Mock
    private TransactionRepository transactionRepository;

    @Autowired
    private RewardService  rewardService;

    @MockBean
    private Transaction transaction;


    @Test
    public void getMonthlyRewardPointsTest() {
        transaction.setCustomerId(1L);
        transaction.setId(1L);
        transaction.setAmount(new BigDecimal(100));
        transaction.setTransactionDate("2024-01-01");
        List<Transaction> list=new ArrayList<>();
        list.add(transaction);
        Mockito.when(transactionRepository.findByCustomerIdAndTransactionDateBetween(1L,anyString(),anyString())).thenReturn(list);
        int sum=rewardService.getMonthlyRewardPoints(transaction.getCustomerId(), transaction.getTransactionDate(), transaction.getTransactionDate());

    }
}


