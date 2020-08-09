package com.mirocidij.threading.task2;

public class FizzBuzz {
    private final int n;
    private int current = 1;

    public int getN() {
        return n;
    }

    public int getCurrent() {
        return current;
    }

    public FizzBuzz(int n) {this.n = n;}

    public void fizz() {
        if (current % 3 == 0 && current % 5 != 0) {
            System.out.print("fizz ");
            current++;
        }
    }

    public void buzz() {
        if (current % 5 == 0 && current % 3 != 0) {
            System.out.print("buzz ");
            current++;
        }
    }

    public void fizzBuzz() {
        if (current % 15 == 0) {
            System.out.print("fizzbuzz ");
            current++;
        }
    }

    public void number() {
        if (current % 3 != 0 && current % 5 != 0) {
            System.out.print(current + " ");
            current++;
        }
    }
}
