package com.sparta.wahdel.palindromes;

import java.util.Arrays;

public class PalindromeChecker {
    public static boolean checkPalindrome(String string) {
        char[] lettersInWord = string.toLowerCase().toCharArray();
        int stringLength = lettersInWord.length;
        char[] reversedLettersInWord = new char[stringLength];
        char letter;
        for (int count = 0; count < stringLength; count++) {
            letter = lettersInWord[stringLength - (count+1)];
            if (Character.isLetter(letter)) {
                reversedLettersInWord[count] = letter;
            }
        }
        return Arrays.equals(reversedLettersInWord, lettersInWord);
    }

    public static String validateString(String string) {
        if (string.isBlank()) {
            throw new NullPointerException("The string is empty!");
        } else {
            return string.trim().toLowerCase();
        }
    }
}