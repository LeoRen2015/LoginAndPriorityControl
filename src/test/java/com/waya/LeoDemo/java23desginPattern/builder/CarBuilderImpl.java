package com.waya.LeoDemo.java23desginPattern.builder;

public class CarBuilderImpl implements CarBuilder {
    private Car car;

    public CarBuilderImpl(){
        this.car = new Car();
    }

    public Car build() {
        return car;
    }

    public CarBuilder setColor(final  String color) {
        car.setColor(color);
        return this;
    }

    public CarBuilder setWheels(final int wheels) {
        car.setWheels(wheels);
        return this;
    }
}
