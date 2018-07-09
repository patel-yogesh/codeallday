package com.codeallday.ctci.chapter1;

import java.util.HashMap;
import java.util.Map;

/* Is Unique: Implement an algorithm to determine if a string has all unique
   characters. What if you cannot use additional data structure?
 */
public class UniqueCharChecker {
    public static boolean isUnique(String myString) {
        Map<Character, Integer> myMap = new HashMap<>();
        for (Character c: myString.toCharArray()) {
            if(myMap.containsKey(c)) {
                return false;
            }
            myMap.put(c, 1);
        }
        return true;
    }

    // Without unique data structure - O(n^2)
    public static boolean isUniqueWithAdditionalDS(String myString) {
        char[] myArray = myString.toCharArray();
        int length = myString.length();

        for(int i=0; i < length; i++) {
            for (int j=i+1; j < length; j++) {
                if(myArray[i] == myArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Without using additional data structure O(1)
    public static boolean isUniqueOptimized(String myString) {
        int checkpoint = 0;
        for(int i=0 ; i < myString.length(); i++) {
            int val = myString.charAt(i) - 'a';
            if( (checkpoint & (1 << val)) > 0) {
                return false;
            }
            checkpoint |= (1 << val);
        }
        return true;
    }
}
