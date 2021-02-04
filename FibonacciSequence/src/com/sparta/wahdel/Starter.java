package com.sparta.wahdel;

public class Starter {
    public static void start() {
        Fibonacci.iterativeFibonacci(20);
        for (int count = 0; count <= 20; count++) {
            Printer.printMessageOneLine(Fibonacci.recursiveFibonacci(count)+" ");
        }
    }
}
