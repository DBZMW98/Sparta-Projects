package com.sparta.wahdel;

import com.sparta.wahdel.Printer;

public class Fibonacci {
    public static void iterativeFibonacci(int number) {
        String result = "";
        int prev = 0;
        int current = 1;
        int temp;
        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                result += "0, ";
            } else if (i == 1) {
                result += "1";

            } else {
                temp = current;
                current = current + prev;
                prev = temp;
                result += ", " + current;
            }
        }
        Printer.printMessage("Fibonacci:");
        Printer.printMessage(result);
    }

    public static int recursiveFibonacci(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return recursiveFibonacci(number - 2) + recursiveFibonacci(number - 1);
        }
    }
}


