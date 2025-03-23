package com.simpleexample.store;

public interface IUserRepository {
    void save(User user);
    User findUserByEmail(String email);
}
