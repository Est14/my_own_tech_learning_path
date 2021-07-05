package com.est14.test3.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    private PaymentGateWay paymentGateWay;
    private PaymentProcessor paymentProcessor;

    @Before
    public void setUp(){
        paymentGateWay = Mockito.mock(PaymentGateWay.class);
        paymentProcessor = new PaymentProcessor(paymentGateWay);
    }
    @Test
    public void testPayment(){

        Mockito.when(paymentGateWay.request(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        boolean result = paymentProcessor.mayPayment(1000);

        assertTrue(result);
    }

    @Test
    public void testPayment_wrong(){

        Mockito.when(paymentGateWay.request(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        assertFalse(paymentProcessor.mayPayment(1000));
    }

}