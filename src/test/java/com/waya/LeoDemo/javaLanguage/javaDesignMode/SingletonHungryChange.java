package com.waya.LeoDemo.javaLanguage.javaDesignMode;

public class SingletonHungryChange {
    private SingletonHungryChange(){
        System.out.println("我是恶汉 变种 ，初始化放在 静态代码块中执行");
    }

    private static  SingletonHungryChange singletonHungryChange;

    static {
        singletonHungryChange = new SingletonHungryChange();
    }

    public static SingletonHungryChange getSingletonHungryChange(){
        return  singletonHungryChange;
    }

}
