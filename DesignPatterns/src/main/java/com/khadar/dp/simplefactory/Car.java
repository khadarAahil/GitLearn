package com.khadar.dp.simplefactory;

public abstract class Car {

    private CarType carType;

    public Car(CarType carType) {
        this.carType = carType;
        arrangeParts();
    }

    private void arrangeParts(){

    }

    public abstract void construct();

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                '}';
    }
}
