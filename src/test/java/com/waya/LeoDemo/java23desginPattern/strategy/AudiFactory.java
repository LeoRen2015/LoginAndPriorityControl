package com.waya.LeoDemo.java23desginPattern.strategy;

public class AudiFactory {
    public static AudiCar getAudi(String name){
        AudiCar audicar = null;
        if(name.equals("a4")){
            audicar= new A4Car();
        }else if(name.equals("a6")){
            audicar = new A6Car();
        }

        return audicar;
    }
    public static void main(String[] args) {
        AudiFactory.getAudi("a4");


    }
}
