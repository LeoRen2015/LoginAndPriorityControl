package com.waya.LeoDemo.java23desginPattern.Factory.AbstractFactory;

public class BInterClass1 implements BInter {
    private int bClass1Num;
    private String bclass1Name;


    public BInterClass1(int bClass1Num,String  bclass1Name){
        this.bClass1Num =  bClass1Num;
        this.bclass1Name = bclass1Name;
    }

    public void bMethod() {
        System.out.println("接口BInter  的实现类 BInterClass1的  实现方法 b1Method");
        System.out.println("bclass1Name="+bclass1Name);
    }
}
