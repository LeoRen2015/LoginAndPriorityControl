package com.waya.LeoDemo.java23desginPattern.conncurent.waitAndSleep.Demo1;

public class Service {

    public void  mSleep() {
        synchronized (this) {

            try {
                System.out.println(System.currentTimeMillis());
                Thread.sleep(3000);
                System.out.println(System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public  void mWait(){
        synchronized (this){
            System.out.println("wait 结束时间： "+ System.currentTimeMillis());
        }
    }
}
