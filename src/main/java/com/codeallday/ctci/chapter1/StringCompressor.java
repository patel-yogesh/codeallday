package com.codeallday.ctci.chapter1;

/*
    Implement a method to perform basic string compression using the counts
    of repeated characters. For example, the string aabcccccaaa would become
    a2b1c5a3. If the "compressed" string would not become smaller than the
    original string, your method should return the original string. You can
    assume the string has only uppercase and lowercase letters.
 */
public class StringCompressor {
    public static String compressString(String input) {
        // Iterate over each letter of the input string and keep track of the
        // consecutive letters
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        boolean compressionRequired = false;
        while(index < input.length()) {
            int forwardPointer = index + 1;
            int numberOfOccurances = 1;
            while(forwardPointer < input.length() &&
                    input.charAt(index) == input.charAt(forwardPointer)) {
                numberOfOccurances++;
                forwardPointer++;
            }
            if(numberOfOccurances > 1) {
                compressionRequired = true;
            }
            stringBuilder.append(input.charAt(index));
            stringBuilder.append(numberOfOccurances);
            index = index + numberOfOccurances;

        }
        if(compressionRequired == true) {
            return stringBuilder.toString();
        } else {
            return input;
        }
    }
}
