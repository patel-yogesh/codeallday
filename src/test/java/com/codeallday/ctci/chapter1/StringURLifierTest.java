package com.codeallday.ctci.chapter1;

import org.junit.Test;

public class StringURLifierTest {
    @Test
    public void testStringURLifier() {
        String input = "Hello world test and            ";
        char[] output = StringURLifier.urlify(input.toCharArray(), 20);
        System.out.println(output);
        System.out.println(StringURLifier.replaceString(input.toCharArray(), 20));
    }
}
