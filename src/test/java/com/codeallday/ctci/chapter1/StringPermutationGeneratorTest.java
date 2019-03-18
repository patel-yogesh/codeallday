package com.codeallday.ctci.chapter1;

import com.codeallday.ctci.chapter1.com.StringPermutationGeneratorPractice;
import org.junit.Test;

public class StringPermutationGeneratorTest {
    @Test
    public void testStringPermutationGeneration() {
        StringPermutationGenerator.generateStringPermutations("Yogesh");
    }

    @Test
    public void testGeneratePermutations() {
        StringPermutationGeneratorPractice.generateStringPermutations("AABC");
    }
}
