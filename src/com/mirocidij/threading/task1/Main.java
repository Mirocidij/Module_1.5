package com.mirocidij.threading.task1;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        CountDownLatch cdlFirst = new CountDownLatch(1);
        CountDownLatch cdlSecond = new CountDownLatch(1);
        Foo foo = new Foo(cdlFirst, cdlSecond);

        ThirdThread thirdThread = new ThirdThread(foo);
        SecondThread secondThread = new SecondThread(foo);
        FirstThread firstThread = new FirstThread(foo);
    }
}
