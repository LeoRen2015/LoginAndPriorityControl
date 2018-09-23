package com.waya.LeoDemo.javaLanguage.javaDesignMode;

public class SingletonHungry {
    private  SingletonHungry(){
        System.out.println("饿汉式的单例");
    }

    static {
        System.out.println("我是在静态构造方法调用前的静态块？？？？？？？？");
    }
    private static SingletonHungry singletonHungry = new SingletonHungry();
    static {
        System.out.println("我是在静态构造方法调用后的静态块？？？？？？？？");
    }
    public  static  SingletonHungry getSingletonHungry(){
        return  singletonHungry;
    }
}
