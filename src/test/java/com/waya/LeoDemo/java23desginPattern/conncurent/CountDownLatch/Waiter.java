package com.waya.LeoDemo.java23desginPattern.conncurent.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Waiter implements Runnable {
    private CountDownLatch countDownLatch = null;

    public Waiter(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }
    public void run() {
        try {
            Long begin = System.currentTimeMillis();
            System.out.println("wait等钱时间"+begin);
            countDownLatch.await();
            Long end = System.currentTimeMillis();
            float time = (end-begin)/1000;
            System.out.println("wait等候时间+"+end+"历时==="+time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
