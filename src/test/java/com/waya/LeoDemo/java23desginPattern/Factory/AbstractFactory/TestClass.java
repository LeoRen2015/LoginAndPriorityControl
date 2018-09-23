package com.waya.LeoDemo.java23desginPattern.Factory.AbstractFactory;

public class TestClass {

    public static void main(String[] args) {
        AfactoryMethod afactoryMethod1 = new A1Factroy();
        afactoryMethod1.getA(20,"a1").aMethod();
        AfactoryMethod afactoryMethod2 = new A2Factory();
        afactoryMethod2.getA(50,"a2").aMethod();
    }
}
