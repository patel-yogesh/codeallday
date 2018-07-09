package com.codeallday.ctci.chapter1;

import org.junit.Test;

public class UniqueCharCheckerTest {
    @Test
    public void testIsUniqueWithAllUnique() {
        assert (UniqueCharChecker.isUnique("Coding"));
    }

    @Test
    public void testWithNotUnique() {
        assert(!UniqueCharChecker.isUnique("Hello"));
    }

    @Test
    public void testUniqueWithoutAdditionalDS() {
        assert(UniqueCharChecker.isUniqueWithAdditionalDS("Coding"));
    }

    @Test
    public void testNegUniqueWithoutAdditionalDS() {
        assert(!UniqueCharChecker.isUniqueWithAdditionalDS("Hello"));
    }

    @Test
    public void testIsUniqueOptimized() {
        assert(!UniqueCharChecker.isUniqueOptimized("hello"));
    }
}
