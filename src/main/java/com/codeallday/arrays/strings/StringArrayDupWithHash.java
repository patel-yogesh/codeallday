package com.codeallday.arrays.strings;

import java.util.ArrayList;
import java.util.HashMap;

public class StringArrayDupWithHash {
    public static void printDublicatStringsInArray(ArrayList<String> strList) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String str: strList) {
            if(hashMap.get(str) == null) {
                hashMap.put(str, 1);
            } else {
                hashMap.put(str, hashMap.get(str));
            }
        }

        for(String str: hashMap.keySet()) {
            if(hashMap.get(str) > 1) {
                System.out.println(str);
            }
        }
    }

}
