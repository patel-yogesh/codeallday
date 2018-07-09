package com.codeallday.design.patterns;
import java.util.Arrays;
import java.util.LinkedList;

public class Singleton {
    private static Singleton instance = null;
    private Integer[] array = {5,6,1,2,3};
    private final LinkedList<Integer> mylist = new LinkedList<>(Arrays.asList(array));
    private Singleton() {

    }

    public static Singleton getInstance(){
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public LinkedList<Integer> getMyList() {
        return instance.mylist;
    }
}