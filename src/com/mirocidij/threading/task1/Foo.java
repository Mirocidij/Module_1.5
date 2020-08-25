package com.mirocidij.threading.task1;

public class Foo {
    private boolean firstCalled = false;
    private boolean secondCalled = false;
    private boolean thirdCalled = false;

    public void first() {
        if (!firstCalled) {
            firstCalled = true;
            System.out.print("first");
            Thread.currentThread().interrupt();
        }
    }

    public void second() {
        if (firstCalled && !secondCalled) {
            secondCalled = true;
            System.out.print("second");
            Thread.currentThread().interrupt();
        }
    }

    public void third() {
        if (secondCalled && !thirdCalled) {
            thirdCalled = true;
            System.out.print("third");
            Thread.currentThread().interrupt();
        }
    }
}
