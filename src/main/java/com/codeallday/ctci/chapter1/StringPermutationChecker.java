package com.codeallday.ctci.chapter1;

import java.util.HashMap;
import java.util.Map;

/*
    Given two strings, write a method to decide if one is a permutation of the other.
 */
public class StringPermutationChecker {
    public static boolean isPermutationOfEachOther(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Integer> hashMap1 = new HashMap<>();
        Map<Character, Integer> hashMap2 = new HashMap<>();

        for(int i=0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            if(hashMap1.containsKey(char1)) {
                int value = hashMap1.get(char1);
                hashMap1.put(char1, value + 1);
            } else {
                hashMap1.put(char1, 1);
            }

            char char2 = str2.charAt(i);
            if(hashMap2.containsKey(char2)) {
                int value = hashMap2.get(char2);
                hashMap2.put(char2, value + 1);
            } else {
                hashMap2.put(char2, 1);
            }
        }

        // At this point, hash map is ready for both the strings. Let's compare
        if(hashMap1.equals(hashMap2)) {
            return true;
        }
        return false;
    }
}
