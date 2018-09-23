package com.waya.LeoDemo.java23desginPattern.conncurent.waitAndSleep.Demo1;

public class TestClass {
    public static void main(String[] args) {
        Service service = new Service();

        Thread sleepThread  = new Thread(new SleepThread(service));
        Thread waitThread = new Thread(new WaitThread(service));

//测试1,2
//        sleepThread.start();
//        waitThread.start();

//        测试3
        waitThread.start();
        sleepThread.start();


    }
}
