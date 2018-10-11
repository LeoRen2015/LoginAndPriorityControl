package com.waya.LeoDemo.java23desginPattern.conncurent.waitAndSleep.Demo1;

public class SleepThread implements  Runnable {
    private Service service;

    public SleepThread (Service service){
        this.service = service;
    }
    public void run() {
//        测试1，以service对象为锁对象
//        service.mSleep();


// 测试2 锁加在Service类对象上
//        synchronized (Service.class){
//            try {
//                System.out.println(System.currentTimeMillis());
//                Thread.sleep(3000);
//                System.out.println(System.currentTimeMillis());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }


//        测试3  wait线程 拿到锁后，调用service的wait方法，将锁释放，进入等待池，等待唤醒。


        synchronized (Service.class){
            try {
                System.out.println("第一个3000前 "+System.currentTimeMillis());
                Thread.sleep(3000);
                Service.class.notifyAll();
                System.out.println("第一个3000后，notify 后"+System.currentTimeMillis());
                Thread.sleep(3000);
                System.out.println("第二个3000后，"+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
