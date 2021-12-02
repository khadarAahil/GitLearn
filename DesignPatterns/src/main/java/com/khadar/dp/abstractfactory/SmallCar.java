package com.khadar.dp.abstractfactory;

import com.khadar.dp.simplefactory.CarType;

public class SmallCar extends Car{

    public SmallCar(Location location){
        super(CarType.SMALL);
        construct();
    }
    @Override
    public void construct() {
        //construct small car
    }
}
