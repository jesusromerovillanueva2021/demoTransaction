package com.example.demoTransaction.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoTransaction.dto.TransactionDto;
import com.example.demoTransaction.service.TransactionService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
	@Autowired
	private TransactionService service;
	
	@GetMapping
	public Flux<TransactionDto> getTransactions(){
		return service.getTransactions();
	}
	
	@GetMapping("/{id}")
	public Mono<TransactionDto> getTransaction(@PathVariable int id){
		return service.getTransaction(id);
	}
	
	@PostMapping
	public Mono<TransactionDto> saveTransaction(@RequestBody Mono<TransactionDto> transaDtoMono){
		return service.saveTransaction(transaDtoMono);
	}
}
