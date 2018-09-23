package com.waya.LeoDemo.java23desginPattern.conncurent.BlockingQueue;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDequeTest {
    public static void main(String[] args) {


        try {
            BlockingDeque<String> deque = new LinkedBlockingDeque<String>();
            deque.addFirst("1");
            deque.addLast("2");

            System.out.println(deque.takeFirst());
            System.out.println(deque.takeLast());

            System.out.println(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
