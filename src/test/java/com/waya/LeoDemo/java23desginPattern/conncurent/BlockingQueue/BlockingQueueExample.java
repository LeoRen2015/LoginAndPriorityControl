package com.waya.LeoDemo.java23desginPattern.conncurent.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

    public static void main(String[] args) {

        BlockingQueue queue = new ArrayBlockingQueue(1);
        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();

        BlockingQueue<String> arrayQueue = new ArrayBlockingQueue<String>(3);
        for(int i = 0; i <3;i++){
            try {
                arrayQueue.put(""+i);
                System.out.println(arrayQueue.remainingCapacity());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
