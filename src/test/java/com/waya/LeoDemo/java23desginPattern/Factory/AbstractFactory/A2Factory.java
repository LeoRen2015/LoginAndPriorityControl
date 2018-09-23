package com.waya.LeoDemo.java23desginPattern.Factory.AbstractFactory;

public class A2Factory implements AfactoryMethod {
    public AInter getA(int num, String name) {
        return new AInterClass2(num,name);
    }
}
