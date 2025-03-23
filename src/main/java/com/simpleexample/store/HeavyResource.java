package com.simpleexample.store;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class HeavyResource {
    public HeavyResource() {
        System.out.println("Creating HeavyResource");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void doSomething() {
        System.out.println("Doing something");
    }
}
