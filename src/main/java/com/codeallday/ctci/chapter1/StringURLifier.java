package com.codeallday.ctci.chapter1;

/*
    Write method to replace all spaces in a string with '%20'. You may assume that the
    string has enough space at the end to hold the additional characters, and you are
    given the true length of the string.
 */
public class StringURLifier {
    public static char[] urlify(char[] input, int length) {
        char[] stringToInsert = "%20".toCharArray();
        int replaceStringLength = 3;
        // Iterate over the character array from beginning to string length
        for(int i=0; i<length; i++) {
            // Check if the current character is space
            if(input[i] == ' ') {
                int spaceAtPosition = i;
                for (int j = length-1; j > spaceAtPosition; j--) {
                    input[j + replaceStringLength - 1] = input[j];
                }
                length = length + replaceStringLength-1;

                for (int k = 0; k < replaceStringLength; k++) {
                    input[k + spaceAtPosition] = stringToInsert[k];
                }
            }
        }
        return input;
    }

    public static char[] replaceString(char[] input, int trueLength) {
        // First find out how many spaces are there in given input string
        int numberOfSpaces = 0;
        for(int i=0; i< trueLength; i++) {
            if(input[i] == ' ') {
                numberOfSpaces++;
            }
        }

        // Short circuit if there is not space in the string
        if(numberOfSpaces == 0) {
            return input;
        }

        // Find out what will be new length of the string after replacing spaces
        int index = trueLength + numberOfSpaces * 2;

        for(int i= trueLength - 1; i>=0; i--) {
            if(input[i] == ' ') {
                input[index-1] = '0';
                input[index - 2] = '2';
                input[index - 3] = '%';
                index = index - 3;
            } else {
                input[index - 1] = input[i];
                index--;
            }
        }
        return input;
    }
}
