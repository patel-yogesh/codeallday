package com.codeallday.advancejava;


public class SingletonThreadTest {
    public static void main(String args[]) {
        Runnable singletonRunnable = new SingletonRunnable();
        Runnable singletonRunnableAgain = new SingletonRunnable();

        new Thread(singletonRunnable).start();
        new Thread(singletonRunnableAgain).start();
    }
}
