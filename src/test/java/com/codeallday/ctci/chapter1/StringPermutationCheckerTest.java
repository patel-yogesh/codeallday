package com.codeallday.ctci.chapter1;

import org.junit.Test;

public class StringPermutationCheckerTest {
    @Test
    public void testPermutationChecker() {
        assert(StringPermutationChecker.isPermutationOfEachOther("hello", "lloeh"));
    }
}
