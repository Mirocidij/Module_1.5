package com.mirocidij.threading.task2;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class FizzBuzz {
    private final int n;
    private final Semaphore semAccess;
    private AtomicInteger curr = new AtomicInteger(1);

    public FizzBuzz(int n, Semaphore semAccess) {
        this.n = n;
        this.semAccess = semAccess;
    }

    public void fizz() throws InterruptedException {
        semAccess.acquire();
        try {
            if (needExit()) {
                Thread.currentThread().interrupt();
                return;
            }

            if (curr.get() % 3 == 0 && curr.get() % 5 != 0) {
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

            if (curr.get() % 5 == 0 && curr.get() % 3 != 0) {
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

            if (curr.get() % 15 == 0) {
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

            if (curr.get() % 3 != 0 && curr.get() % 5 != 0) {
                System.out.print(curr.get() + " ");
                incCurr();
            }
        } finally {
            semAccess.release();
        }
    }

    private boolean needExit() {
        return curr.get() > n;
    }

    private void incCurr() {
        curr.incrementAndGet();
    }
}
