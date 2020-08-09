package com.mirocidij.threading.task1;

public class SecondThread extends Thread {
    private Foo foo;

    public SecondThread(Foo foo) {

        this.foo = foo;
    }

    @Override
    public void run() {
        while (true) {
            if (foo.isFirstCalled()) {
                foo.second();
                return;
            }
        }
    }
}
