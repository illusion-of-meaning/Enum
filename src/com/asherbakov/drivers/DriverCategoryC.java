package com.asherbakov.drivers;

import com.asherbakov.transport.Train;

public class DriverCategoryC<T extends Train> extends Driver {

    public DriverCategoryC(String fullName, int experience) {
        super(fullName, experience);
    }

    public void race(T transport) {
        System.out.println(String.format("Водитель %s управляет автомобилем '%s' и будет участвовать в заезде.", getFullName(), transport.toString()));
    }

}
