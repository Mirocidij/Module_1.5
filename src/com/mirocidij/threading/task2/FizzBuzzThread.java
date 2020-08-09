package com.mirocidij.threading.task2;

public class FizzBuzzThread extends Thread {
    private FizzBuzz fizzBuzz;

    public FizzBuzzThread(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    @Override
    public void run() {
        while (fizzBuzz.getCurrent() != fizzBuzz.getN()) {
            fizzBuzz.fizzBuzz();
        }
    }
}
