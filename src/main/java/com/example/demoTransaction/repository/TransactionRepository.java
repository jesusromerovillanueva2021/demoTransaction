package com.example.demoTransaction.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.demoTransaction.entity.Transaction;

public interface TransactionRepository extends ReactiveCrudRepository<Transaction, Integer> {

}
