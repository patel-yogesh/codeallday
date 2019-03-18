package com.codeallday.advancejava;

public class Singleton {
    private static Singleton instance = null;

    private Singleton() {}

    static boolean firstThread = true;

    public static  Singleton getInstance() {
        if(instance == null) {

            if(firstThread) {
                firstThread = false;
                Thread.currentThread();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized(Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}