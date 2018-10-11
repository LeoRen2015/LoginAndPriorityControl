package com.waya.LeoDemo.java23desginPattern.conncurent.Lock.threadLocal;

public class ThreadLocalConnectionTest {
//    https://blog.csdn.net/qq_36632687/article/details/79551828

    public static void main(String[] args) {

        System.out.println( ThreadLocalConnection.getString1());
        new Thread(new Runnable(){
            public void run() {
                System.out.println(ThreadLocalConnection.getString1());
            }
        }).start();
    }
}