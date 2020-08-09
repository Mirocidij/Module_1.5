package com.mirocidij.threading.task2;

public class FizzThread extends Thread {
    private FizzBuzz fizzBuzz;

    public FizzThread(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    @Override
    public void run() {
        while (fizzBuzz.getCurrent() != fizzBuzz.getN()) {
            fizzBuzz.fizz();
        }
    }
}
