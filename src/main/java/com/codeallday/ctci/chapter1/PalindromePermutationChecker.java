package com.codeallday.ctci.chapter1;

import java.util.HashMap;
import java.util.Map;

/*
    Given string, write a functional to check if it is a permutation of a
    palindrome. A palindrome is word or phrase that is the same forwards and backwards.
    A permutation is a re-arrangement of letters. The palindrome does not need
    to be limited to just dictionary words.
    Example:
    input: Tact Coa
    Output: True (permutations: "taco cat", "atco cta", etc.)
 */
public class PalindromePermutationChecker {
    public static boolean isPalindromePermutation(String input) {
        // In order for the string to be palindrome permutation, it would need
        // at-most single odd number of characters. i.e. all characters should
        // appear in the string even number of times, except one

        Map<Character, Integer> myMap = new HashMap<>();
        for(int i=0; i<input.length(); i++) {
            Character key = input.charAt(i);
            if(key == ' ') continue;
            myMap.put(key, myMap.containsKey(key) ? myMap.get(key) + 1 : 1 );
        }

        int numberOfOddCharacters = 0;
        for(Integer value: myMap.values()) {
            if(value % 2 != 0 ) {
                numberOfOddCharacters++;
            }
        }

        if(numberOfOddCharacters > 1) {
            return false;
        }

        return true;
    }
}
