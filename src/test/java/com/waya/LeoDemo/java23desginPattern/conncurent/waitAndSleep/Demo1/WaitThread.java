package com.waya.LeoDemo.java23desginPattern.conncurent.waitAndSleep.Demo1;

public class WaitThread implements Runnable {
    private  Service service;
    public  WaitThread(Service service){
        this.service = service;
    }
    public void run() {
//       测试1  以service对象为锁
//        service.mWait();

// 测试2 锁加在Service类对象上
//        synchronized (Service.class){
//            System.out.println(System.currentTimeMillis());
//        }

//       测试3 先调用wait线程，获取对象锁，然后wait释放对象锁，等待唤醒，
        synchronized (Service.class){
            System.out.println("wait 调用时间"+System.currentTimeMillis());
            try {
                System.out.println("wait 调用时间"+System.currentTimeMillis());
                Service.class.wait();
                System.out.println("wait 调用时间+++++++"+System.currentTimeMillis());
                System.out.println("wait 调用时间+++++++"+System.currentTimeMillis());
                System.out.println("wait 调用时间+++++++"+System.currentTimeMillis());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
