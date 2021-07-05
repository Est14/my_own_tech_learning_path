package com.est14.test3.payments;

public class PaymentProcessor {

    private PaymentGateWay paymentGateWay;

    public PaymentProcessor(PaymentGateWay paymentGateWay) {
        this.paymentGateWay = paymentGateWay;
    }

    public boolean mayPayment(double amount){

        return true;
    }
}
