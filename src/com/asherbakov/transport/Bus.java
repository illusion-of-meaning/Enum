package com.asherbakov.transport;

import com.asherbakov.interfaces.Compating;
import com.asherbakov.transport.enums.Capacity;
import com.asherbakov.transport.enums.LoadCapacity;

public class Bus extends Transport implements Compating {
    private Capacity capacity;
    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        if (capacity != null) {
            this.capacity = capacity;
        }
    }

    @Override
    public void type() {
        if(capacity != null) {
            System.out.println(capacity.getCapacity());
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
        System.out.println("Автобус на пит-стопе");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время для автобуса - 5:20");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость автобуса: 105 км/ч");
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.getBrand(), super.getModel());
    }
}
