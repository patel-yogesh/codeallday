package com.codeallday.ctci.chapter1;

import org.junit.Test;

public class OneWayCheckerTest {
    @Test
    public void testOneAwayString() {
        assert (OneAwayChecker.isOneAway("perk", "perks"));
    }
}
