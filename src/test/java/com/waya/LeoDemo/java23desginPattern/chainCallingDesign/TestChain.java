package com.waya.LeoDemo.java23desginPattern.chainCallingDesign;

import java.util.HashMap;

public class TestChain {
    public static void main(String[] args) {
         Apojo apojo = new Apojo();
        PojoBuilder pojoBuilder = new PojoBuilderImpl(apojo);
        apojo = pojoBuilder.setA_int(1).setB_string("2").setC_long(3l).setMap(new HashMap()).create();
        System.out.println();
    }
}
