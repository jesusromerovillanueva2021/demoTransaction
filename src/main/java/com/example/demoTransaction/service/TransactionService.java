package com.example.demoTransaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoTransaction.dto.TransactionDto;
import com.example.demoTransaction.repository.TransactionRepository;
import com.example.demoTransaction.utils.AppUtils;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TransactionService {
	@Autowired
	private TransactionRepository repository;
	
	public Flux<TransactionDto> getTransactions(){
		return repository.findAll()
				.map(AppUtils::entityToDto);
	}
	
	public Mono<TransactionDto> getTransaction(int id){
		return repository.findById(id)
				.map(AppUtils::entityToDto);
	}
	
	public Mono<TransactionDto> saveTransaction(Mono<TransactionDto> transactionMono){		
		return transactionMono.map(AppUtils::dtoToEntity)
				.flatMap(repository::save)
				.map(AppUtils::entityToDto);
	}
	
	
}
