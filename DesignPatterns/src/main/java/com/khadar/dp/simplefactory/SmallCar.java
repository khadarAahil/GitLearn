package com.khadar.dp.simplefactory;

public class SmallCar extends Car{

    public SmallCar(){
        super(CarType.SMALL);
        construct();
    }


    @Override
    public void construct() {
        // Method to construct the SMALL car.
    }
}
