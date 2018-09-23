package com.waya.LeoDemo.java23desginPattern.builder;

public class CarBuildDirector {

    /*
    *
    *
    * */


    private CarBuilder carBuilder;
    public  CarBuildDirector(final CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }
    public Car construct(){
        return carBuilder.setColor("red").setWheels(4).setWheels(2).build();
    }
    public static void main(String[] args) {
        final CarBuilder builder = new CarBuilderImpl();
        final CarBuildDirector carBuildDirector = new CarBuildDirector(builder);
        System.out.println(carBuildDirector.construct());
    }
}
