package com.mirocidij.threading.task2;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1, true);
        FizzBuzz fizzBuzz = new FizzBuzz(15, semaphore);

        FizzThread fizzThread = new FizzThread(fizzBuzz);
        BuzzThread buzzThread = new BuzzThread(fizzBuzz);
        FizzBuzzThread fizzBuzzThread = new FizzBuzzThread(fizzBuzz);
        NumberThread numberThread = new NumberThread(fizzBuzz);
    }
}
