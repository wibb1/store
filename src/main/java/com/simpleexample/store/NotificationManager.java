package com.simpleexample.store;

import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    private final INotificationService notificationService;

    public NotificationManager(INotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notify(String message, String receiver) {
        notificationService.send(message, receiver);
    }
}
