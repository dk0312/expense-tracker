package com.dk0312.expense_tracker.service;

import com.dk0312.expense_tracker.model.TransactionEntity;
import com.dk0312.expense_tracker.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public void saveTransaction(TransactionEntity transactionEntity) {
        transactionRepository.save(transactionEntity);
    }

    public List<TransactionEntity> findByUserId(Long userId) {
        return transactionRepository.findByUserId(userId);
    }
}
