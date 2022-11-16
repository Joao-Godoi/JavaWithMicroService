package com.joaogodoi.hrpayroll.resources;

import com.joaogodoi.hrpayroll.entities.Payment;
import com.joaogodoi.hrpayroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payment")
public class PaymentResource {

    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> get(@PathVariable Long workerId, @PathVariable Integer days) {
        Payment payment = paymentService.getPayment(workerId, days);
        return ResponseEntity.ok(payment);
    }
}
