package com.sparta.wahdel.palindromes;

import com.sparta.wahdel.Printer;

import java.util.ArrayList;
import java.util.List;

public class PalindromeSentence extends PalindromeChecker{
    public static void palindromeSentenceCheck(String sentence) {
        String trimmedSentence = validateString(sentence), longestPalindrome;
        String[] wordsInSentence;
        List<String> palindromeList = new ArrayList<String>();
        Printer.printMessage("Sentence: " + trimmedSentence);
        wordsInSentence = trimmedSentence.replaceAll("[^a-zA-Z ]", "").split(" ");

        for (String word:wordsInSentence) {
            if (checkPalindrome(word)) {
                palindromeList.add(word);
            }
        }

        if (palindromeList.size() == 0) {
            Printer.printMessage("There are no palindromes in the sentence");
        } else {
            longestPalindrome = palindromeList.get(0);
            for (String palindrome : palindromeList) {
                if (palindrome.length() > longestPalindrome.length()) {
                    longestPalindrome = palindrome;
                }
            }
            Printer.printMessage("Longest palindrome: " + longestPalindrome);
        }
    }
}
