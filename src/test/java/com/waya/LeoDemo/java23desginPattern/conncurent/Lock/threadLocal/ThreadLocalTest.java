package com.waya.LeoDemo.java23desginPattern.conncurent.Lock.threadLocal;

import java.sql.Connection;

public class ThreadLocalTest{
    ThreadLocal<Long> longThreadLocal = new ThreadLocal<Long>();
    ThreadLocal<String> stringThreadLocal = new ThreadLocal<String>();
    ThreadLocal<Connection>  connectionThreadLocal = new ThreadLocal<Connection>();

    public void setThreadLocal(){
        longThreadLocal.set(Thread.currentThread().getId());
        stringThreadLocal.set(Thread.currentThread().getName());
    }

    public Long getLongThreadLocal() {
        return longThreadLocal.get();
    }
    public String getStringThreadLocal(){
        return stringThreadLocal.get();
    }
    public Connection getConnect(){
        return connectionThreadLocal.get();
    }
    public static void main(String[] args) {
         final ThreadLocalTest  threadLocalTest = new ThreadLocalTest();
        threadLocalTest.setThreadLocal();

        System.out.println(threadLocalTest.getLongThreadLocal());
        System.out.println(threadLocalTest.getStringThreadLocal());

        new Thread(new Runnable() {
            public void run() {
                threadLocalTest.setThreadLocal();

                ThreadLocal<String> stringaa = new ThreadLocal();
                stringaa.set("aa");
                System.out.println("stirngaa======"+stringaa.get());

                System.out.println(threadLocalTest.getLongThreadLocal());
                System.out.println(threadLocalTest.getStringThreadLocal());

            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                threadLocalTest.setThreadLocal();
                System.out.println(threadLocalTest.getLongThreadLocal());
                System.out.println(threadLocalTest.getStringThreadLocal());
            }
        }).start();


    }
}