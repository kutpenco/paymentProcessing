package br.com.abmex.paymentProcessing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.abmex.paymentProcessing.model.Payment;
import br.com.abmex.paymentProcessing.service.PaymentService;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/process")
    public ResponseEntity<Long> processPayment(@RequestBody Payment payment) {
        Long processingId = paymentService.processPayment(payment);
        return new ResponseEntity<>(processingId, HttpStatus.CREATED);
    }
}
