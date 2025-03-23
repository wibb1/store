package com.simpleexample.store;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final IUserRepository userRepository;
    private final INotificationService notificationService;

    public UserService(InMemoryUserRepository userRepository, INotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerUser(User newUser) {
        if (userRepository.findUserByEmail(newUser.getEmail()) != null) {
            throw new RuntimeException("User " + newUser.getEmail() + " already exists");
        }
        userRepository.save(newUser);
        String message = "User registered: Name: " + newUser.getName() + " Email: " + newUser.getEmail();
        notificationService.send(message, newUser.getEmail());
    }
}
