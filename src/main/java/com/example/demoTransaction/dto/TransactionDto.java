package com.example.demoTransaction.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto {
	private int id;
	private int idInitialAccount;
	private int idDestinationAccount;
	private double amount;
	private Date date;
}
