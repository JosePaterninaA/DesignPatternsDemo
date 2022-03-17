package com.designpatterns.demo.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singleton.Singleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonTest {

    @Test
    public void whenGetInstanceIsCalledOnce_OnlyOneInstanceIsCreated(){
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        Assertions.assertEquals(instance1, instance2);
    }



}
