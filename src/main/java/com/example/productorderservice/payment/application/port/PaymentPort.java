package com.example.productorderservice.payment.application.port;

import com.example.productorderservice.order.entity.Order;
import com.example.productorderservice.payment.domain.Payment;

public interface PaymentPort {

    public Order getOrder(Long orderId);

    void pay(int totalPrice, String cardNumber);

    void save(Payment payment);
}
