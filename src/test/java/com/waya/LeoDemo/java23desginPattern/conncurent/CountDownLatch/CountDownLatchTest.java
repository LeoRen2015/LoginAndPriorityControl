package com.waya.LeoDemo.java23desginPattern.conncurent.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public static void main(String[] args) {
        CountDownLatch countDownLatch  = new CountDownLatch(3);
        new Thread(new Waiter(countDownLatch)).start();
        new Thread(new Decrementer(countDownLatch)).start();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
