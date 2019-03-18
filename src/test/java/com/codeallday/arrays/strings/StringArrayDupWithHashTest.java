package com.codeallday.arrays.strings;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StringArrayDupWithHashTest {
    @Test
    public void testStringDuplicates() {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("abc", "abc", "bbc", "cdf", "ad", "cdf"));
        StringArrayDupWithHash.printDublicatStringsInArray(arrayList);
    }
}
