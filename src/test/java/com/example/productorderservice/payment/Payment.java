package com.example.productorderservice.payment;

import com.example.productorderservice.order.Order;
import lombok.Getter;
import org.springframework.util.Assert;

@Getter
class Payment {
    private Long id;
    private final Order order;
    private final String cardNumber;

    public Payment(Order order, String cardNumber) {
        Assert.notNull(order, "주문은 필수입니다.");
        Assert.hasText(cardNumber, "카드 번호는 필수입니다.");
        this.order = order;
        this.cardNumber = cardNumber;
    }

    public void assignId(Long id) {
        this.id = id;
    }

    public int getPrice() {
        return order.getTotalPrice();
    }
}