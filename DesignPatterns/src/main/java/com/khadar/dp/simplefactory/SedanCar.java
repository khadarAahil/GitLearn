package com.khadar.dp.simplefactory;

public class SedanCar extends Car{
    public SedanCar() {
        super(CarType.SEDAN);
        construct();
    }

    @Override
    public void construct() {
        //Method to construct Sedan car.
    }
}
