package com.codeallday.advancejava;

public class SingletonRunnable implements Runnable {
    public void run() {
        Singleton newInstance = Singleton.getInstance();
        System.out.println(System.identityHashCode(newInstance));
    }
}
