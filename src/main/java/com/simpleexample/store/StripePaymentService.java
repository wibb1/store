package com.simpleexample.store;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

//@Service("stripe")
//@Primary
public class StripePaymentService implements IPaymentService {
    @Value("${stripe.api-url}")
    private String apiUrl;
    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout: 3000}")
    private int timeout;

    @Value("${stripe.supported-currencies}")
    private List<String> supportedCurrencies;

    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE PAYMENT SERVICE");
        System.out.println("API URL: " + apiUrl);
        System.out.println("Amount: " + amount);
        System.out.println("Timeout: " + timeout);
        System.out.println("Enabled: " + enabled);
        System.out.println("Supported Currencies: " + supportedCurrencies);

        System.out.println("Processing payment with Stripe");
    }
}
