package com.waya.LeoDemo.java23desginPattern.conncurent.CountDownLatch;

import sun.java2d.SurfaceDataProxy;

import java.util.concurrent.CountDownLatch;

public class Decrementer implements Runnable{
    private CountDownLatch countDownLatch = null;
    public Decrementer(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }
    public void run() {

        try {
            Thread.sleep(1000);
            countDownLatch.countDown();
            System.out.println("decrementer的第一次"+countDownLatch.getCount());

            Thread.sleep(1000);
            countDownLatch.countDown();
            System.out.println("decrementer的第二次"+countDownLatch.getCount());

            Thread.sleep(3000);
            countDownLatch.countDown();
            System.out.println("decrementer的第三次"+countDownLatch.getCount());
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
