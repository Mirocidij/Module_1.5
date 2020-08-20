package com.mirocidij.threading.task2;

import java.util.concurrent.Semaphore;

public class FizzBuzz {
    private final int n;
    private Semaphore semaphore;
    private int current = 1;

    public FizzBuzz(int n, Semaphore semaphore) {
        this.n = n;
        this.semaphore = semaphore;
    }

    public void fizz() throws InterruptedException {
        semaphore.acquire();
        try {
            if (needExit()) {
                Thread.currentThread().interrupt();
                return;
            }

            if (current % 3 == 0 && current % 5 != 0) {
                System.out.print("fizz ");
                current++;
            }
        } finally {
            semaphore.release();
        }
    }

    public void buzz() throws InterruptedException {
        semaphore.acquire();
        try {
            if (needExit()) {
                Thread.currentThread().interrupt();
                return;
            }

            if (current % 5 == 0 && current % 3 != 0) {
                System.out.print("buzz ");
                current++;
            }
        } finally {
            semaphore.release();
        }
    }

    public void fizzBuzz() throws InterruptedException {
        semaphore.acquire();
        try {
            if (needExit()) {
                Thread.currentThread().interrupt();
                return;
            }

            if (current % 15 == 0) {
                System.out.print("fizzbuzz ");
                current++;
            }
        } finally {
            semaphore.release();
        }
    }

    public void number() throws InterruptedException {
        semaphore.acquire();
        try {
            if (needExit()) {
                Thread.currentThread().interrupt();
                return;
            }

            if (current % 3 != 0 && current % 5 != 0) {
                System.out.print(current + " ");
                current++;
            }
        } finally {
            semaphore.release();
        }
    }

    private boolean needExit() {
        return current > n;
    }
}
