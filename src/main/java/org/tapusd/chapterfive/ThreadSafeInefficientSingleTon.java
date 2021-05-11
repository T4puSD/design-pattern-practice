package org.tapusd.chapterfive;

import java.util.Objects;

public class ThreadSafeInefficientSingleTon {
    private static ThreadSafeInefficientSingleTon uniqueInstance;

    private ThreadSafeInefficientSingleTon() {}

    /**
     * Despite this class being thread-safe, we can see that there's a clear performance drawback:
     * each time we want to get the instance of our singleton, we need to acquire a potentially unnecessary lock.
     * @return instance of {@link ThreadSafeInefficientSingleTon}
     */
    public static synchronized ThreadSafeInefficientSingleTon getInstance() {
        if (Objects.isNull(uniqueInstance)) {
            uniqueInstance = new ThreadSafeInefficientSingleTon();
        }
        return uniqueInstance;
    }
}
