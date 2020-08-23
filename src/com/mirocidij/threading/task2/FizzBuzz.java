package com.mirocidij.threading.task2;

import java.util.concurrent.Semaphore;

public class FizzBuzz {
    private final int n;
    private final Semaphore semAccess;
    private final Semaphore semInc;
    private int current = 1;

    public FizzBuzz(int n, Semaphore semAccess, Semaphore semInc) {
        this.n = n;
        this.semAccess = semAccess;
        this.semInc = semInc;
    }

    public void fizz() throws InterruptedException {
        semAccess.acquire();
        try {
            if (needExit()) {
                Thread.currentThread().interrupt();
                return;
            }

            if (current % 3 == 0 && current % 5 != 0) {
                System.out.print("fizz ");
                incCurr();
            }
        } finally {
            semAccess.release();
        }
    }

    public void buzz() throws InterruptedException {
        semAccess.acquire();
        try {
            if (needExit()) {
                Thread.currentThread().interrupt();
                return;
            }

            if (current % 5 == 0 && current % 3 != 0) {
                System.out.print("buzz ");
                incCurr();
            }
        } finally {
            semAccess.release();
        }
    }

    public void fizzBuzz() throws InterruptedException {
        semAccess.acquire();
        try {
            if (needExit()) {
                Thread.currentThread().interrupt();
                return;
            }

            if (current % 15 == 0) {
                System.out.print("fizzbuzz ");
                incCurr();
            }
        } finally {
            semAccess.release();
        }
    }

    public void number() throws InterruptedException {
        semAccess.acquire();
        try {
            if (needExit()) {
                Thread.currentThread().interrupt();
                return;
            }

            if (current % 3 != 0 && current % 5 != 0) {
                System.out.print(current + " ");
                incCurr();
            }
        } finally {
            semAccess.release();
        }
    }

    private boolean needExit() {
        return current > n;
    }

    private void incCurr() throws InterruptedException {
        semInc.acquire();
        try {
            current++;
        } finally {
            semInc.release();
        }
    }
}
