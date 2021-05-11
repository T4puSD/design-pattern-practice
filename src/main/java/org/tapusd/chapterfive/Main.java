package org.tapusd.chapterfive;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        singleTon.updateCounter();
        System.out.println(singleTon.getCounter());
        singleTon.updateCounter();
        System.out.println(singleTon.getCounter());

        CountDownLatch latch = new CountDownLatch(1);
        Thread t1 = new ThreadSingleTon(latch);
        Thread t2 = new ThreadSingleTon(latch);

        t1.start();
        t2.start();

        // starting both thread at the same time(effectively) (finger crossed)
        latch.countDown();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After thread completion");
        System.out.println("Counter Val: " + singleTon.getCounter());
    }
}

class ThreadSingleTon extends Thread {

    private final CountDownLatch latch;

    public ThreadSingleTon(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            latch.await();
            final ThreadSafeSingleTon instance = ThreadSafeSingleTon.getInstance();
            instance.updateCounter();
            System.out.println("Updated counter val: " + instance.getCounter());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
