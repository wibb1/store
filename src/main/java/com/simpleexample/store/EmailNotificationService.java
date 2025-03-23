package com.simpleexample.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements INotificationService {
    @Value("${email.username}")
    private String username;

    @Value("${email.port}")
    private Integer port;

    @Value("${email.host}")
    private String host;


    public void send(String message, String receiver) {
        System.out.println("Email Notification: " + message + " sent to " + receiver);
        System.out.println("Email Configuration: " + username + " " + port + " " + host);
    }
}
