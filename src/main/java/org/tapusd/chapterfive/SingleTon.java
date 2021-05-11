package org.tapusd.chapterfive;

import java.util.Objects;

public class SingleTon {
    private static SingleTon uniqueInstance;
    private String name;

    private SingleTon() {}

    public static SingleTon getInstance() {
        if (Objects.isNull(uniqueInstance)) {
            uniqueInstance = new SingleTon();
        }

        return uniqueInstance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
