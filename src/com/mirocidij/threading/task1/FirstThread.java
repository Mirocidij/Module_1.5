package com.mirocidij.threading.task1;

public class FirstThread extends Thread {
    private Foo foo;

    public FirstThread(Foo foo) {

        this.foo = foo;
    }

    @Override
    public void run() {
        foo.first();
    }
}