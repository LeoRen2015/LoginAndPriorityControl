package com.waya.LeoDemo.java23desginPattern.conncurent.Lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {
    private java.util.concurrent.locks.ReadWriteLock lock = new ReentrantReadWriteLock();

    public void getThread(Thread thread){
        try {
            lock.readLock().lock();
            int i = 30;

            while (i>0){
                System.out.println(thread.getName()+"当前的i值"+i);
//                Thread.sleep(10);
                i--;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }

    public static void main(String[] args) {
        final ReadWriteLock readWriteLock =new ReadWriteLock();

        new Thread(new Runnable() {
            public void run() {
                readWriteLock.getThread(Thread.currentThread());
            }
        }).start();


        new Thread(new Runnable() {
            public void run() {
                readWriteLock.getThread(Thread.currentThread());
            }
        }).start();



    }

}
