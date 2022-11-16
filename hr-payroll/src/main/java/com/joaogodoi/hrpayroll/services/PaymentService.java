package com.joaogodoi.hrpayroll.services;

import com.joaogodoi.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public Payment getPayment(long workerId, int days) {
        return new Payment("João", 500.0, days);
    }
}
