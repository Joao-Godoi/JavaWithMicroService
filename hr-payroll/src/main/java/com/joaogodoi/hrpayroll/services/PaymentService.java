package com.joaogodoi.hrpayroll.services;

import com.joaogodoi.hrpayroll.entities.Payment;
import com.joaogodoi.hrpayroll.entities.Worker;
import com.joaogodoi.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days) {
        Map<String, String> uriVariables = new HashMap<String, String>();
        uriVariables.put("id", "" + workerId);

        Worker worker = workerFeignClient.getWorker(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
