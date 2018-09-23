package com.waya.LeoDemo.java23desginPattern.Factory.AbstractFactory;

public class AInterClass1 implements AInter {

    private int aclass1Num;
    private String aclass1Name;

    public void aMethod() {
        System.out.println("接口AInter  的实现类 AInterClass1的  实现方法 a1Method");
        System.out.println("aclass1Name="+aclass1Name);
    }

    public AInterClass1(int aclass1Num,String aclass1Name){
        this.aclass1Num = aclass1Num;
        this.aclass1Name = aclass1Name;
        this.aclass1Name = aclass1Name;
    }

}
