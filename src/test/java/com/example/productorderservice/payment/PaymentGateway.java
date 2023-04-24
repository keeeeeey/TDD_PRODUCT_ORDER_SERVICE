package com.example.productorderservice.payment;

interface PaymentGateway {
    public void execute(int totalPrice, String cardNumber);
}
