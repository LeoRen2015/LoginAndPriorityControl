package com.waya.LeoDemo.java23desginPattern.Factory.AbstractFactory;

public class AInterClass2 implements AInter {
    private int aclass2Num;
    private String aclass2Name;

    public AInterClass2(){};

    public AInterClass2(int aclass2Num,String aclass2Name){
        this.aclass2Num = aclass2Num;
        this.aclass2Name = aclass2Name;
    }
    public void aMethod() {

        System.out.println("接口AInter  的实现类 AInterClass2的  实现方法 a2Method");
        System.out.println("aclass2Name="+aclass2Name);

    }
}
