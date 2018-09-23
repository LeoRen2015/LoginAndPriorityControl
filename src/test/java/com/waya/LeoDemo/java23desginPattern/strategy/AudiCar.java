package com.waya.LeoDemo.java23desginPattern.strategy;

public abstract  class AudiCar {
    private  String name;

    public abstract void makeCar();

    public void setName(String  name){
        this.name = name;
    }


    public String getName(){
        return  this.name;
    }
}
