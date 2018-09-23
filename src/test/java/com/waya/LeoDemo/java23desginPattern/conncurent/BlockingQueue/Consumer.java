package com.waya.LeoDemo.java23desginPattern.conncurent.BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue queue = null;
    public Consumer(BlockingQueue queue){
        this.queue = queue;
    }

    public void run() {
        try {
            System.out.println("queue  Consumer 剩余容量 -----------"+queue.remainingCapacity());
            System.out.println(queue.take());
            System.out.println("queue  Consumer 剩余容量 -----------"+queue.remainingCapacity());
            Thread.sleep(1000);
            System.out.println("consumer 睡完 1秒");
            System.out.println("queue  Consumer 剩余容量 -----------"+queue.remainingCapacity());
            System.out.println(queue.take());
            System.out.println("queue    Consumer  剩余容量 -----------"+queue.remainingCapacity());
            Thread.sleep(2000);
            System.out.println("consumer 睡完 2秒");
            System.out.println(queue.take());
            Thread.sleep(3000);
            System.out.println("consumer 睡完 3秒");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
