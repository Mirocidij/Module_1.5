package com.mirocidij.threading.task2;

public class BuzzThread extends Thread {

    private FizzBuzz fizzBuzz;

    public BuzzThread(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    @Override
    public void run() {
        while (fizzBuzz.getCurrent() != fizzBuzz.getN()) {
            fizzBuzz.buzz();
        }
    }
}
