package com.dk0312.expense_tracker.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "transactions")
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private Double amount;
    private String description;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
