package com.mirocidij.threading.task2;

public class FizzBuzz {
    private final int n;
    private int current = 1;

    public FizzBuzz(int n) {this.n = n;}

    public synchronized void fizz() {
        if (needExit()) Thread.currentThread().interrupt();

        if (current % 3 == 0 && current % 5 != 0) {
            System.out.print("fizz ");
            current++;
        }
    }

    public synchronized void buzz() {
        if (needExit()) Thread.currentThread().interrupt();

        if (current % 5 == 0 && current % 3 != 0) {
            System.out.print("buzz ");
            current++;
        }
    }

    public synchronized void fizzBuzz() {
        if (needExit()) Thread.currentThread().interrupt();

        if (current % 15 == 0) {
            System.out.print("fizzbuzz ");
            current++;
        }
    }

    public synchronized void number() {
        if (needExit()) Thread.currentThread().interrupt();

        if (current % 3 != 0 && current % 5 != 0) {
            System.out.print(current + " ");
            current++;
        }
    }

    private boolean needExit() {
        return current >= n;
    }
}
