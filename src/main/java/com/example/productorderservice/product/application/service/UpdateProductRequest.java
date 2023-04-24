package com.example.productorderservice.product.application.service;

import com.example.productorderservice.product.domain.DiscountPolicy;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

@Getter
@NoArgsConstructor
public class UpdateProductRequest {

    private String name;
    private int price;
    private DiscountPolicy discountPolicy;

    public UpdateProductRequest(String name, int price, DiscountPolicy discountPolicy) {
        Assert.hasText(name, "상품명은 필수입니다.");
        Assert.isTrue(price > 0, "상품 가격은 0보다 커야 합니다.");
        Assert.notNull(discountPolicy, "할인 정책은 필수입니다.");
        this.name = name;
        this.price = price;
        this.discountPolicy = discountPolicy;
    }
}
