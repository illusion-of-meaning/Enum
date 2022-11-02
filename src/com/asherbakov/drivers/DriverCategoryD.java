package com.asherbakov.drivers;

import com.asherbakov.transport.Bus;

public class DriverCategoryD<T extends Bus> extends Driver {

    public DriverCategoryD(String fullName, int experience) {
        super(fullName, experience);
    }

    public void race(T transport) {
        System.out.println(String.format("Водитель %s управляет автомобилем '%s' и будет участвовать в заезде.", getFullName(), transport.toString()));
    }

}
