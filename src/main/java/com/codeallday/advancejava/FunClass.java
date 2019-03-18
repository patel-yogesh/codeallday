package com.codeallday.advancejava;

import java.util.ArrayList;
import java.util.function.Predicate;

public class FunClass {
    public static void streamFun() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < 20; i++ ) {
            arrayList.add(i);
        }
        arrayList.stream().forEach( number -> System.out.println(number));
    }
}
