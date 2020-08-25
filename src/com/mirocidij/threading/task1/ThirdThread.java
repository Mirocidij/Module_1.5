package com.mirocidij.threading.task1;

public class ThirdThread extends Thread {
    private final Foo foo;

    public ThirdThread(Foo foo) {
        this.foo = foo;

        start();
    }

    @Override
    public void run() {
        foo.third();
    }
}
