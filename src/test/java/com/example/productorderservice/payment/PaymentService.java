package com.example.productorderservice.payment;

import com.example.productorderservice.order.Order;

public class PaymentService {
    private final PaymentPort paymentPort;

    PaymentService(PaymentPort paymentPort) {
        this.paymentPort = paymentPort;
    }

    public void payment(final PaymentRequest request) {
        final Order order = paymentPort.getOrder(request.getOrderId());

        final Payment payment = new Payment(order, request.getCardNumber());

        paymentPort.pay(payment.getPrice(), payment.getCardNumber());
        paymentPort.save(payment);
    }
}
