package com.mirocidij.threading.task2;

public class BuzzThread extends Thread {
    private final FizzBuzz fizzBuzz;

    public BuzzThread(FizzBuzz fizzBuzz) {
        super("Buzz");

        this.fizzBuzz = fizzBuzz;

        start();
    }

    @Override
    public void run() {
        while (!interrupted()) {
            fizzBuzz.buzz();
        }
    }
}
