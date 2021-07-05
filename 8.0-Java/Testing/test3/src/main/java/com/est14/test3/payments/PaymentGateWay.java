package com.est14.test3.payments;

public interface PaymentGateWay {

    PaymentResponse  request(PaymentRequest request);
}
