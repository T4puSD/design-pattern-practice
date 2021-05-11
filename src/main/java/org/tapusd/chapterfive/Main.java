package org.tapusd.chapterfive;

public class Main {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        singleTon.setName("Nice");
        System.out.println(singleTon.getName());
    }
}
