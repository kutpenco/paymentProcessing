package br.com.abmex.paymentProcessing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.abmex.paymentProcessing.transaction.PaymentTransaction;
import jakarta.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	//void save(PaymentTransaction transaction);
}