package com.waya.LeoDemo.java23desginPattern.conncurent.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    public static void main(String[] args) {
     Lock lock = new ReentrantLock();
        try {
            Thread.sleep(2000);
            lock.lock();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }




}
