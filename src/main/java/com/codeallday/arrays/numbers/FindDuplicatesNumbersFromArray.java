package com.codeallday.arrays.numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesNumbersFromArray {
    public static void main(String args[]) {
        int array[] = {5,10,4,5,2,3,2};
        ArrayList<Integer> duplicateElements = findDuplicateElements(array);
        for(int i: duplicateElements) {
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> findDuplicateElements(int[] input) {
        Map mymap = new HashMap();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i: input) {
            if(mymap.get(i) == null) {
                mymap.put(i, 1);
            } else {
                arrayList.add(i);
            }
        }
        return arrayList;
    }
}