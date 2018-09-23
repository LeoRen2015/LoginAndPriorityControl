package com.waya.LeoDemo.java23desginPattern.Factory.AbstractFactory;

public class BInterClass2 implements BInter {
    private int bClass2Num;
    private String bclass2Name;


    public BInterClass2(int bClass2Num,String  bclass2Name){
        this.bClass2Num =  bClass2Num;
        this.bclass2Name = bclass2Name;
    }

    public void bMethod() {
        System.out.println("接口BInter  的实现类 BInterClass1的  实现方法 b1Method");
        System.out.println("bclass1Name="+bclass2Name);
    }
}
