package com.waya.LeoDemo.java23desginPattern.strategy;

public class CarContext {

    AudiCar audiCar = null;

    public CarContext(AudiCar car){
        this.audiCar = car;
    }
    public void orderCar(){
        this.audiCar.makeCar();
    }

    public static void main(String[] args) {
        AudiCar audiCar  =  new A4Car();
        audiCar.setName("奥迪a4");
        CarContext carContext = new CarContext(audiCar);
        carContext.orderCar();
    }

}
