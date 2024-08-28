package com.example.demo_2.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.id;
import java.math.BigDecimal;
@Entity
public class Transaction {
    @Id
    @Generatedvalue (strategy = GenerationType. IDENTITY)
    private Long id;
    pravace Long customeria:
    private BigDecimal amount;
    private string transactionDate;

    public java.lang.Long getId() {
        return id;
    }

    public void setId(java.lang.Long id) {
        this.id = id;
    }

    public pravace getLong() {
        return Long;
    }

    public void setLong(pravace aLong) {
        Long = aLong;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public string getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(string transactionDate) {
        this.transactionDate = transactionDate;
    }
}
