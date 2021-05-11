package org.tapusd.chapterfive;

import java.util.Objects;

public class ThreadSafeDoubleCheckedSingleTon {
    private static volatile ThreadSafeDoubleCheckedSingleTon uniqueInstance;

    private ThreadSafeDoubleCheckedSingleTon() {}

    /**
     * Verifying if we need to create the object in the first place and only in that case we would acquire the lock.
     * @return instance of {@link ThreadSafeDoubleCheckedSingleTon}
     */
    public static ThreadSafeDoubleCheckedSingleTon getInstance() {
        if (Objects.isNull(uniqueInstance)) {
            synchronized (ThreadSafeDoubleCheckedSingleTon.class) {
                if (Objects.isNull(uniqueInstance)) {
                    uniqueInstance = new ThreadSafeDoubleCheckedSingleTon();
                }
            }
        }
        return uniqueInstance;
    }
}
