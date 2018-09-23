package com.waya.LeoDemo.javaLanguage.javaLoadingOrder;

public class Outer {
    static {
        System.out.println("外部类的静态代码块");
    }

    private  Outer(){};

    static class Inner{
//        private static  final  Outer outer = new Outer();
        private static int aInt =1;
        static {
            System.out.println("静态内部类的静态方法");
        }
    }

    public static int  test1(){
       return Inner.aInt;
    }

    public static  void bb(){

    }

//    public static Outer getOuter(){
//        return Inner.outer;
//    }
}
