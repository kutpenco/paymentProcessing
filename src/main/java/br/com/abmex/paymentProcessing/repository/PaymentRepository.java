package br.com.abmex.paymentProcessing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.abmex.paymentProcessing.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}