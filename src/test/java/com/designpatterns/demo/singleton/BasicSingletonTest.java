package com.designpatterns.demo.singleton;

import org.junit.jupiter.api.Test;
import singleton.BasicSingleton;
import singleton.Singleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicSingletonTest {

    @Test
    public void concurrentThread() throws InterruptedException {
        int numberOfThreads = 1000;
        ExecutorService service = Executors.newFixedThreadPool(10);
        CountDownLatch latch = new CountDownLatch(numberOfThreads);

        for (int i = 0; i < numberOfThreads; i++) {
            service.execute(() -> {
                BasicSingleton.getInstance();
                latch.countDown();
            });
        }
        latch.await();

        assertEquals(numberOfThreads + 1, BasicSingleton.usageCounter);
    }
}
