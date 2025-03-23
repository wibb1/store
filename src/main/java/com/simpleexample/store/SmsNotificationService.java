package com.simpleexample.store;

import org.springframework.stereotype.Service;

@Service("sms")
public class SmsNotificationService implements INotificationService {
    public void send(String message, String receiver) {
        System.out.println("Email Notification: " + message + " sent to " + receiver);
    }
}
