package com.example.demo_2.model;
import javax.persistence.Entity;
import javax.persistence.generatedvalue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Customer {
    @Id
    @generatedValue(strategy = GenerationType.IDENTITY)
    private Long 1d;
    private
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
