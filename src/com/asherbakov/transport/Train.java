package com.asherbakov.transport;

import com.asherbakov.interfaces.Compating;
import com.asherbakov.transport.enums.BodyType;
import com.asherbakov.transport.enums.LoadCapacity;

public class Train extends Transport implements Compating {
    private LoadCapacity loadCapacity;

    public Train(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        if (loadCapacity != null) {
            this.loadCapacity = loadCapacity;
        }
    }

    @Override
    public void type() {
        if(loadCapacity != null) {
            System.out.println(loadCapacity.getLoadCapacity());
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
        System.out.println("Грузовик на пит-стопе");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время для грузовика - 5:09");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость грузовика: 108 км/ч");
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.getBrand(), super.getModel());
    }
}
