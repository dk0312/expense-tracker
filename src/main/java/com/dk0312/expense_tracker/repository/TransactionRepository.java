package com.dk0312.expense_tracker.repository;

import com.dk0312.expense_tracker.model.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
    List<TransactionEntity> findByUserId (Long userId);
}
