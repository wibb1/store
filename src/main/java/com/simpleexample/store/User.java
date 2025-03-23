package com.simpleexample.store;

//@Model
public class User {

    private static long currentId = 0L;
    private final Long id;
    private final String email;
    private final String password;
    private final String name;

    public User(String email, String password, String name) {
        this.id = currentId++;
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void printUser() {
        System.out.println("User: " + name + " " + email);
    }
}
