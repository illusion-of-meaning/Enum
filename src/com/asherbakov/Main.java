package com.asherbakov;

import com.asherbakov.drivers.DriverCategoryB;
import com.asherbakov.drivers.DriverCategoryC;
import com.asherbakov.drivers.DriverCategoryD;
import com.asherbakov.transport.Bus;
import com.asherbakov.transport.Car;
import com.asherbakov.transport.Train;
import com.asherbakov.transport.Transport;
import com.asherbakov.transport.enums.BodyType;

public class Main {
    public static void main(String[] args) {
        Transport car1 = new Car("Lada", "Vesta Sport", 1.8, BodyType.SEDAN);
        System.out.println(car1);
        car1.type();
        Transport bus1 = new Bus("ПАЗ", "320530/40-02", 4.6, null);
        System.out.println(bus1);
        bus1.type();
        Transport train1 = new Train("КАМАЗ", "5490", 11.7 , null);
        System.out.println(train1);
        train1.type();

    }
}
