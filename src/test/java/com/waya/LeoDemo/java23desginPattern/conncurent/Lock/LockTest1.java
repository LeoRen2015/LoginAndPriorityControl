package com.waya.LeoDemo.java23desginPattern.conncurent.Lock;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest1 {
        public ArrayList<Integer> arrayList = new ArrayList<Integer>();

        private Lock lock = new ReentrantLock();
        public void  insert(Thread thread){
            try {
                lock.lock();
                System.out.println("得到了锁");
                for(int i=0;i<5;i++){

                    arrayList.add(i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println(thread.getName()+"锁释放");
                lock.unlock();
            }

        }

    public static void main(String[] args) {
        final LockTest1 lockTest1 = new LockTest1();

        new Thread(new Runnable() {
            public void run() {
                lockTest1.insert(Thread.currentThread());
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                lockTest1.insert(Thread.currentThread());
            }
        }).start();
    }
}
