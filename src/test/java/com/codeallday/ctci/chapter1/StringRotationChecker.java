package com.codeallday.ctci.chapter1;

/*
   Assume you have a method isSubString which checks if one word is a
   substring of another. Given two strings, s1 and s2, write code to
   check if s2 is a rotation of s1 using only one call to isSubstring
   (e.g. "waterbottle" is a rotation of "erbottlewat")
 */
public class StringRotationChecker {
    public static boolean isStringRotation(String s1, String s2) {
        if(s1.length() != s2.length() || s1.length() == 0) {
            return false;
        }

        String s1s1 = s1 + s1;
        return s1s1.contains(s2);
    }
}
