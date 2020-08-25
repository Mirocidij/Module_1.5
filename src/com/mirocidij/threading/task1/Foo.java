package com.mirocidij.threading.task1;

import java.util.concurrent.CountDownLatch;

public class Foo {
    private final CountDownLatch cdlFirst;
    private final CountDownLatch cdlSecond;

    public Foo(CountDownLatch cdlFirst, CountDownLatch cdlSecond) {
        this.cdlFirst = cdlFirst;
        this.cdlSecond = cdlSecond;
    }

    public void first() {
        System.out.print("first");

        cdlFirst.countDown();
    }

    public void second() {
        try {
            cdlFirst.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print("second");

        cdlSecond.countDown();
    }

    public void third() {
        try {
            cdlSecond.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print("third");
    }
}
