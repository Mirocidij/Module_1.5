package com.mirocidij.threading.task2;

public class FizzBuzzThread extends Thread {
    private final FizzBuzz fizzBuzz;

    public FizzBuzzThread(FizzBuzz fizzBuzz) {
        super("FizzBuzz");

        this.fizzBuzz = fizzBuzz;

        start();
    }

    @Override
    public void run() {
        while (!interrupted()) {
            try {
                fizzBuzz.fizzBuzz();
            } catch (InterruptedException ignored) { }
        }
    }
}
