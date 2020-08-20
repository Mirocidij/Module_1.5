package com.mirocidij.threading.task1;

public class ThirdThread extends Thread {
    private Foo foo;

    public ThirdThread(Foo foo) {
        this.foo = foo;

        start();
    }

    @Override
    public void run() {
        while (true) {
            if (foo.isSecondCalled()) {
                foo.third();
                return;
            }
        }
    }
}
