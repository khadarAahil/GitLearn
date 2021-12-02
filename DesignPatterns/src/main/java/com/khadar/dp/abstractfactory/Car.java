package com.khadar.dp.abstractfactory;

import com.khadar.dp.simplefactory.CarType;

public abstract class Car {

    private Location location;

    private CarType carType;

    public Car(CarType carType){
        this.carType = carType;
    }

    public Car(Location location, CarType carType) {
        this.location = location;
        this.carType = carType;
        assembleParts();
    }

    public abstract void construct();

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    private void assembleParts(){

        // Car parts assembling process starts here...
    }

    @Override
    public String toString() {
        return "Car{" +
                "location=" + location +
                ", carType=" + carType +
                '}';
    }
}
