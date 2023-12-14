package br.com.abmex.paymentProcessing.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import br.com.abmex.paymentProcessing.option.PaymentOption;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime time;
    private LocalDateTime expires;
    private String paymentUrl;
    private UUID paymentId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "payment")
    private List<PaymentOption> paymentOptions;

    // getters and setters
}
