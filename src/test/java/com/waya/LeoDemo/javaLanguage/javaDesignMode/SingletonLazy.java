package com.waya.LeoDemo.javaLanguage.javaDesignMode;

public class SingletonLazy {

        public static int i;
        public static  SingletonLazySafe singletonLazySafe;
        public static SingletonLazy getSing(){
            if(singletonLazy == null){
                singletonLazy = new SingletonLazy();
                System.out.println("进来，已经初始化了。。。。。。。。。。。。。");
            }else {
                System.out.println("已经初始化了》》》》》》》》》》");
            }
            return  singletonLazy;
        }
    public static void getSing11(){
        System.out.println("静态方法getSing11 调用执行");
    }
    static {

        System.out.println("我是静态代码块1"+singletonLazySafe);
    }
    static {
        System.out.println("I="+i);
    }
    private SingletonLazy(){
        System.out.println("私有构造方法被调用");
    };
    private static SingletonLazy singletonLazy  = new SingletonLazy();
}
