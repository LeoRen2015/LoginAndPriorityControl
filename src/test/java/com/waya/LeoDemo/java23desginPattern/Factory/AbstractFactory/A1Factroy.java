package com.waya.LeoDemo.java23desginPattern.Factory.AbstractFactory;

public class A1Factroy implements AfactoryMethod {
    public AInter getA(int num, String name) {
        return new AInterClass1(num,name);
    }
}
