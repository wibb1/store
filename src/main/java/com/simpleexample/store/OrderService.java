package com.simpleexample.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class OrderService {
//    @Autowired
    private IPaymentService paymentService;

    public OrderService() {
    }

    public OrderService(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostConstruct
    public void init() {
        System.out.println("OrderService post construct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("OrderService pre destroy");
    }

    public void placeOrder() {
        paymentService.processPayment(10.0);
    }

    public void setPaymentService(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(String number, int i) {
        paymentService.processPayment(10.0);
    }
}
