package com.dk0312.expense_tracker.repository;

import com.dk0312.expense_tracker.model.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
    @Query("SELECT t FROM TransactionEntity t WHERE t.user.id = :userId")
    List<TransactionEntity> findByUserId(@Param("userId") Long userId);
}