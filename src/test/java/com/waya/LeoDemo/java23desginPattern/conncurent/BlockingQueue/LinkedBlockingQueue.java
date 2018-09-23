package com.waya.LeoDemo.java23desginPattern.conncurent.BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class LinkedBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue<String>  queue = new java.util.concurrent.LinkedBlockingQueue<String>();
        BlockingQueue<String> bounded = new java.util.concurrent.LinkedBlockingQueue<String>(1024);

        try {
            bounded.put("value");
            bounded.put("asdasd");
            bounded.put("value");
            System.out.println(bounded.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
