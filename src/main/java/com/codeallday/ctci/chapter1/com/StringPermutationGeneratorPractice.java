package com.codeallday.ctci.chapter1.com;

import java.util.HashSet;
import java.util.Set;

public class StringPermutationGeneratorPractice {
    public static void generateStringPermutations(String str) {
        Set<String> myset = new HashSet<>();

        printPermutations(str, "", myset);
        myset.stream().forEach( e -> System.out.println(e));
    }

    private static void printPermutations(String str, String prefix, Set<String> result) {
        if(str.length() == 0) {
            //result.add(prefix);
        }

        for(int i =0 ; i < str.length(); i++) {
            String rem = str.substring(0 , i) + str.substring(i+1);
            if(!result.contains(rem)) {
                result.add(rem);
                printPermutations(rem, prefix + str.charAt(i), result);
            }
        }
    }
}
