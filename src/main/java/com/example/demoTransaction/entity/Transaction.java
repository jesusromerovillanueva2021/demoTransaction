package com.example.demoTransaction.entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.example.demoTransaction.dto.TransactionDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("transaction")
public class Transaction {
	private int id;
	private int idInitialAccount;
	private int idDestinationAccount;
	private double amount;
	private Date date;
}
