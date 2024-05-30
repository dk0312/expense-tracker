package com.dk0312.expense_tracker.controller;

import com.dk0312.expense_tracker.model.TransactionEntity;
import com.dk0312.expense_tracker.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<?> createTransaction(@RequestBody TransactionEntity transaction) {
        transactionService.saveTransaction(transaction);
        return ResponseEntity.ok("Transaction added");
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<TransactionEntity>> getTransactionsByUserId(@PathVariable Long userId) {
        List<TransactionEntity> transactions = transactionService.findByUserId(userId);
        return ResponseEntity.ok(transactions);
    }
}
