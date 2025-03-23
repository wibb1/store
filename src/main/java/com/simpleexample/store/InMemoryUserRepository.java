package com.simpleexample.store;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryUserRepository implements IUserRepository {
    private final Map<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        saveUser(user);
        System.out.println("User saved: Name: " + user.getName() + " Email: " + user.getEmail());
    }

    @Override
    public User findUserByEmail(String email) {
        return users.getOrDefault(email, null);
    }

    public void saveUser(User user) {
        user.printUser();
        users.put(user.getEmail(), user);
    }

}
