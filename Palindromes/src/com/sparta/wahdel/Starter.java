package com.sparta.wahdel;

import com.sparta.wahdel.palindromes.PalindromeSentence;
import com.sparta.wahdel.palindromes.PalindromeString;

public class Starter {
    public static void start() {
        Printer.printMessage("Is a Palindrome: "+ PalindromeString.palindromeStringCheck("Bob"));
        Printer.printMessage("Is a Palindrome: "+PalindromeString.palindromeStringCheck("Bobby"));
        try {
            Printer.printMessage("Is a Palindrome: " + PalindromeString.palindromeStringCheck(""));
        } catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
        }

        PalindromeSentence.palindromeSentenceCheck(" Hello wow TNT carrac. World ");
        PalindromeSentence.palindromeSentenceCheck(" Hello World ");
    }
}
