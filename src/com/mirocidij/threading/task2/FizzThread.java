package com.mirocidij.threading.task2;

public class FizzThread extends Thread {
    private final FizzBuzz fizzBuzz;

    public FizzThread(FizzBuzz fizzBuzz) {
        super("Fizz");

        this.fizzBuzz = fizzBuzz;

        start();
    }

    @Override
    public void run() {
        while (!interrupted()) {
            fizzBuzz.fizz();
        }
    }
}
