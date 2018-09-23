package com.waya.LeoDemo.MultiThread.ThreadPoolExcutor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadDemo implements Runnable {


    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+"线程 id ============="+Thread.currentThread().getId());
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,6,1, TimeUnit.DAYS, queue);
        for(int i=0;i<10;i++){
            executor.execute(new Thread(new ThreadDemo(),"ThreadDemo".concat(""+i)));
            int threadSize = queue.size();
            System.out.println( "线程队列大小----->" + threadSize);

        }
        executor.shutdown();
    }



}
