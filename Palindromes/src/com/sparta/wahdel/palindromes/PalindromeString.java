package com.sparta.wahdel.palindromes;

import com.sparta.wahdel.Printer;

public class PalindromeString extends PalindromeChecker{
    public static boolean palindromeStringCheck(String string) {
        String trimmedString = validateString(string);
        Printer.printMessage("Word: " + trimmedString);
        return checkPalindrome(trimmedString);
    }
}
