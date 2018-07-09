package com.codeallday.ctci.chapter1;

import org.junit.Test;

public class StringCompressorTest {
    @Test
    public void testStringCompressor() {
        System.out.println(StringCompressor.compressString("abcd"));
        System.out.println(StringCompressor.compressString("aabccccdd"));
    }
}
