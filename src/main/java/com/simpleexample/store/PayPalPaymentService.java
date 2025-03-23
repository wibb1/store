package com.simpleexample.store;

//@Service("paypal")
public class PayPalPaymentService implements IPaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL PAYMENT SERVICE");
        System.out.println("Amount: " + amount);
        System.out.println("Processing payment with PayPal");
    }
}
