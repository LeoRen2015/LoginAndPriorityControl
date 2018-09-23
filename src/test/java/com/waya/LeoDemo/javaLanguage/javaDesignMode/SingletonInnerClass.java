package com.waya.LeoDemo.javaLanguage.javaDesignMode;

public class SingletonInnerClass {

    private SingletonInnerClass(){
        System.out.println("外部类 被初始化了");
    };

    public static class InnerClass{
        private static final SingletonInnerClass  singletonInnerClass = new SingletonInnerClass();
    }
    public static SingletonInnerClass getsingletonInnerClass(){
        return InnerClass.singletonInnerClass;
    }
}
