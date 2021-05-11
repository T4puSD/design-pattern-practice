package org.tapusd.chapterfive;

import java.util.Objects;

public class SingleTon {
    private static SingleTon uniqueInstance;
    private int counter;

    private SingleTon() {}

    public static SingleTon getInstance() {
        if (Objects.isNull(uniqueInstance)) {
            uniqueInstance = new SingleTon();
        }

        return uniqueInstance;
    }

    public void updateCounter() {
        this.counter++;
    }

    public int getCounter() {
        return counter;
    }
}
