package com.mirocidij.threading.task2;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(15);

        FizzThread fizzThread = new FizzThread(fizzBuzz);
        BuzzThread buzzThread = new BuzzThread(fizzBuzz);
        FizzBuzzThread fizzBuzzThread = new FizzBuzzThread(fizzBuzz);
        NumberThread numberThread = new NumberThread(fizzBuzz);
    }
}
