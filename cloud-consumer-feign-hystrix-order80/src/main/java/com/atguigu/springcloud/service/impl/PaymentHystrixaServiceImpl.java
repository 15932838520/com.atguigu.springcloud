package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

@SuppressWarnings("all")
@Component
public class PaymentHystrixaServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
