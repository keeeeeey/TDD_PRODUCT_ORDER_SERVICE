package com.example.productorderservice.payment.adapter;

public interface PaymentGateway {
    public void execute(int totalPrice, String cardNumber);
}
