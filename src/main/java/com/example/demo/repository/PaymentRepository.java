package com.example.demo.repository;

import com.example.demo.dto.PaymentRequest;
import com.example.demo.dto.PaymentResponse;
import com.example.demo.entity.PaymentEntity;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {

    public PaymentEntity getPaymentById(PaymentRequest request){
        PaymentEntity entity = executeQuery(request);
        return entity;
    }

    private PaymentEntity executeQuery(PaymentRequest request){
        PaymentEntity entity = new PaymentEntity();
        entity.setId(request.getPaymentId());
        entity.setPaymentCurrency("INR");
        entity.setPaymentAmount(100);
        return entity;
    }
}
