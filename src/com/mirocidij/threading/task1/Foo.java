package com.mirocidij.threading.task1;

public class Foo {

    private boolean firstCalled = false;
    private boolean secondCalled = false;
    private boolean thirdCalled = false;

    public boolean isFirstCalled() {
        return firstCalled;
    }

    public boolean isSecondCalled() {
        return secondCalled;
    }

    public boolean isThirdCalled() {
        return thirdCalled;
    }

    public void first() {
        System.out.print("first");
        firstCalled = true;
    }

    public void second() {
        System.out.print("second");
        secondCalled = true;
    }

    public void third() {
        System.out.print("third");
        thirdCalled = true;
    }
}
