package com.example.demoTransaction.utils;

import java.beans.Beans;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;

import com.example.demoTransaction.dto.TransactionDto;
import com.example.demoTransaction.entity.Transaction;

public class AppUtils {
	public static TransactionDto entityToDto(Transaction transaction) {
		TransactionDto transactionDto=new TransactionDto();
		BeanUtils.copyProperties(transaction, transactionDto);
		return transactionDto;
	}
	public static Transaction dtoToEntity(TransactionDto transactionDto) {
		Transaction transaction=new Transaction();
		BeanUtils.copyProperties(transactionDto, transaction);
		return transaction;
	}
}
