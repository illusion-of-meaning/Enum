package com.asherbakov.transport;

import com.asherbakov.interfaces.Compating;
import com.asherbakov.transport.enums.BodyType;

public class Car extends Transport implements Compating {
    private BodyType bodyType;
    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        if (bodyType != null) {
            this.bodyType = bodyType;
        }
    }

    @Override
    public void type() {
        if(bodyType != null) {
            System.out.println(bodyType.getBodyType());
        } else {
            System.out.println("данных по авто недостаточно");
        }
    }

    @Override
    protected void startMoving() {

    }

    @Override
    protected void stopMoving() {

    }

    @Override
    public void pitStop() {
        System.out.println("Легковой автомобиль на пит-стопе");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время для легкового автомобиля - 3:59");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость легкового автомобиля: 180 км/ч");
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.getBrand(), super.getModel());
    }
}
