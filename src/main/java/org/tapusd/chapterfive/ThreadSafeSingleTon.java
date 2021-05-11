package org.tapusd.chapterfive;

public class ThreadSafeSingleTon {
    private static ThreadSafeSingleTon uniqueInstance = new ThreadSafeSingleTon();
    private int counter;

    private ThreadSafeSingleTon() {}

    /**
     * Early initialization. 100% guaranteed it is thread safe as object is created as soon as class gets created.
     * @return instance of {@link ThreadSafeSingleTon}
     */
    public static ThreadSafeSingleTon getInstance() {
        return uniqueInstance;
    }

    public void updateCounter() {
        this.counter++;
    }

    public int getCounter() {
        return counter;
    }
}
