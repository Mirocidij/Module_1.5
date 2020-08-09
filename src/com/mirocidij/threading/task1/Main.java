package com.mirocidij.threading.task1;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();
        FirstThread firstThread = new FirstThread(foo);
        SecondThread secondThread = new SecondThread(foo);
        ThirdThread thirdThread = new ThirdThread(foo);

        thirdThread.start();
        secondThread.start();
        firstThread.start();
    }
}