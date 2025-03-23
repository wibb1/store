package com.simpleexample.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${stripe.enabled}")
    private boolean stripeEnabled;

    @Value("${notification.email.enabled}")
    private boolean emailEnabled;

    @Bean
    public IPaymentService stripe() {
        return new StripePaymentService();
    }

    @Bean
    public IPaymentService payPal() {
        return new PayPalPaymentService();
    }


    @Bean
    public OrderService orderService() {
        return new OrderService(stripeEnabled ? stripe() : payPal());
    }

    @Bean
    public EmailNotificationService emailNotificationService() {
        return new EmailNotificationService();
    }

    @Bean
    public SmsNotificationService smsNotificationService() {
        return new SmsNotificationService();
    }

    @Bean
    public NotificationManager notificationManager() {
        return new NotificationManager(emailEnabled ? emailNotificationService() : smsNotificationService());
    }
}
