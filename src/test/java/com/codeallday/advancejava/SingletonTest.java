package com.codeallday.advancejava;

import org.junit.Test;

public class SingletonTest {
    @Test
    public void testSingletonGetInstance() {
        Singleton newInstance1 = Singleton.getInstance();
        System.out.println(System.identityHashCode(newInstance1));

        Singleton newInstance2 = Singleton.getInstance();
        System.out.println(System.identityHashCode(newInstance2));
    }
}
