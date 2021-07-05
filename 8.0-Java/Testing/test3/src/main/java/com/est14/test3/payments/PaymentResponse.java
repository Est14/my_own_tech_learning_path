package com.est14.test3.payments;

public class PaymentResponse {

    enum PaymentStatus {
        OK, ERROR
    }
    private PaymentStatus status;

    public PaymentResponse() {
    }

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
