package com.mirocidij.threading.task2;

public class NumberThread extends Thread {
    private final FizzBuzz fizzBuzz;

    public NumberThread(FizzBuzz fizzBuzz) {
        super("Number");

        this.fizzBuzz = fizzBuzz;

        start();
    }

    @Override
    public void run() {
        while (!interrupted()) {
            fizzBuzz.number();
        }
    }
}
