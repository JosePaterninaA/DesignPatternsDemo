package com.designpatterns.demo.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singleton.Singleton;

public class SingletonTest {

    @Test
    public void whenGetInstanceIsCalledOnce_OnlyOneInstanceIsCreated(){
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        Assertions.assertEquals(instance1, instance2);
    }
}
