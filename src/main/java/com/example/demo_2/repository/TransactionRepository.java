package com.example.demo_2.repository;
importcom.example.rewardprogram.repository;
import com.example.rewardprogram.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByCustomerIdAndTransactionDateBetween(Long customerId, String startDate, String endDate);
}
