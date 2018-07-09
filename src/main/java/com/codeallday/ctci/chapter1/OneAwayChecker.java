package com.codeallday.ctci.chapter1;

/*
    There are three types of edits that can be performed on string: insert a character,
    remove a character, or replace a character. Given two strings, write a function to
    check if they are one edit (or zero edits) away.
    Example:
    pale, ple => true
    pales, pale => true
    pale, bale => true
    bale, bake => false
 */
public class OneAwayChecker {
    public static boolean isOneAway(String thing1, String thing2) {

        // Iterate over both strings at the same time and record change
        // as we observe. One second change bail out to return false.

        // To be efficient we can short circuit if the difference between
        // length of the string is greater than 2
        if( Math.abs(thing1.length() - thing2.length()) > 1 ) {
            return false;
        } else if (thing1.length() == thing2.length()) {
            return checkForReplacedChar(thing1, thing2);
        } else if (thing1.length() > thing2.length()) {
            return checkForEdits(thing2, thing1);
        } else {
            return checkForEdits(thing1, thing2);
        }
    }

    private static boolean checkForReplacedChar(String thing1, String thing2) {
        boolean differenceDetected = false;
        for(int i=0; i < thing1.length(); i++) {
            if(thing1.charAt(i) != thing2.charAt(i)) {
                if(differenceDetected == true) return false;
                differenceDetected = true;
            }
        }
        return true;
    }

    private static boolean checkForEdits(String shorter, String longer) {
        int index1 = 0;
        int index2 = 0;
        boolean differenceDetected = false;
        while(index1 < shorter.length() && index2 < longer.length()) {
            if(shorter.charAt(index1) != longer.charAt(index2)) {
                if(differenceDetected == true) return false;
                differenceDetected = true;
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }
}
