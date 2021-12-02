package com.khadar.dp.simplefactory;

public class LuxuryCar extends Car{
    public LuxuryCar() {
        super(CarType.LUXURY);
        construct();
    }

    @Override
    public void construct() {
        //Logic to construct the Luxury car
    }
}
