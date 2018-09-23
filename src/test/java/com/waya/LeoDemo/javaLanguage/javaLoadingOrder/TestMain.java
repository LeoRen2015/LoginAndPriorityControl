package com.waya.LeoDemo.javaLanguage.javaLoadingOrder;

public class TestMain {
    public static void main(String[] args) {
//        Outer outer = Outer.getOuter();


        try {
            Class.forName("com.waya.LeoDemo.javaLanguage.javaLoadingOrder.Outer"); // 加载的时候 内部的静态代码块被执行
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

//        Outer.test1();
//        Outer.bb();

    }
}
