package br.com.abmex.paymentProcessing.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.abmex.paymentProcessing.model.Payment;
import br.com.abmex.paymentProcessing.repository.PaymentRepository;
import br.com.abmex.paymentProcessing.repository.TransactionRepository;
import br.com.abmex.paymentProcessing.transaction.PaymentTransaction;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    public Long processPayment(Payment payment) {
        // Implemente as regras de negócio para escolher a operadora de cartão
        // ...

        // Salve o pagamento e crie uma transação associada
        Payment savedPayment = paymentRepository.save(payment);

        PaymentTransaction transaction = new PaymentTransaction();
        transaction.setTransactionTime(LocalDateTime.now());
        transaction.setProcessingId(UUID.randomUUID());
        transaction.setPayment(savedPayment);

        transactionRepository.save(transaction);

        return transaction.getId();
    }
}
