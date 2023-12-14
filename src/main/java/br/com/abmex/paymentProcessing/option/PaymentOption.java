package br.com.abmex.paymentProcessing.option;

import java.math.BigDecimal;

import br.com.abmex.paymentProcessing.model.Payment;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class PaymentOption {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String chain;
    private String currency;
    private String network;
    private BigDecimal estimatedAmount;
    private BigDecimal requiredFeeRate;
    private BigDecimal minerFee;
    private int decimals;
    private boolean selected;

    @ManyToOne
    @JoinColumn(name = "payment_id", nullable = false)
    private Payment payment;

    // getters and setters
}
