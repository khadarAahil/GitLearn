package com.khadar.dp.abstractfactory;

import com.khadar.dp.simplefactory.CarType;

public class SedanCar extends Car{

   public SedanCar(Location location){
       super(CarType.SEDAN);
       construct();
    }
    @Override
    public void construct() {

    }
}
