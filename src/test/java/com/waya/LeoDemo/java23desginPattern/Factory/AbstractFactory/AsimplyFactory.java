package com.waya.LeoDemo.java23desginPattern.Factory.AbstractFactory;

public class AsimplyFactory {
    public static AInter getA(String name){
        AInter a = null;
        if(name.equals("AInterClass1")){
            a = new AInterClass1(30,"AInterClass1 工厂创建赋值");
        }else if(name.equals("AInterClass2")){
            a= new AInterClass2(40,"AInterClass2 工厂创建赋值");
        }
        return a;
    }
    public static void main(String[] args) {
        AInter a1 = AsimplyFactory.getA("AInterClass1");
        AInter  a2 = AsimplyFactory.getA("AInterClass2");
        a1.aMethod();
        a2.aMethod();
    }
}
