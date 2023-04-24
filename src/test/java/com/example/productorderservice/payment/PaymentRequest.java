package com.example.productorderservice.payment;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

@Getter
@NoArgsConstructor
public class PaymentRequest {
    private Long orderId;
    private String cardNumber;

    public PaymentRequest(Long orderId, String cardNumber) {
        Assert.notNull(orderId, "주문 ID는 필수입니다.");
        Assert.hasText(cardNumber, "카드 번호는 필수입니다.");
        this.orderId = orderId;
        this.cardNumber = cardNumber;
    }
}
