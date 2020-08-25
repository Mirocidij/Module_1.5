package com.mirocidij.threading.task1;

public class SecondThread extends Thread {
    private final Foo foo;

    public SecondThread(Foo foo) {
        this.foo = foo;

        start();
    }

    @Override
    public void run() {
        foo.second();
    }
}
