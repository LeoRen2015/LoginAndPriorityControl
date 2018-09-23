package com.waya.LeoDemo.javaLanguage.javaDesignMode;

public class SingletonLazySafe {
    private SingletonLazySafe(){
        System.out.println("SingletonLazySafe 懒汉线程安全");
    };

    private static SingletonLazySafe singletonLazySafe;

    public  synchronized  static   SingletonLazySafe  getSingletonLazySafe(){
        if(singletonLazySafe == null){

            singletonLazySafe  = new SingletonLazySafe();
        }
        return singletonLazySafe;
    }
}
