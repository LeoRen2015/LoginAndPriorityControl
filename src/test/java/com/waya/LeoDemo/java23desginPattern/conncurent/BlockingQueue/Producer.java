package com.waya.LeoDemo.java23desginPattern.conncurent.BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private BlockingQueue queue = null;
    public Producer(BlockingQueue queue){
        this.queue = queue;
    }
    public void run() {
        try {
            System.out.println("queue  Producer 剩余容量 -----------"+queue.remainingCapacity());

            queue.put("1");
            System.out.println("queue Producer 剩余容量 -----------"+queue.remainingCapacity());

            System.out.println("+++++++++++++++放入1");
//            Thread.sleep(1000);
            queue.put("2");
            System.out.println("queue Producer 剩余容量 -----------"+queue.remainingCapacity());

            System.out.println("+++++++++++++放入2");
//            Thread.sleep(2000);
            queue.put("3");
            System.out.println("queue Producer 剩余容量 -----------"+queue.remainingCapacity());

            System.out.println("+++++++++++++++ 放入3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
