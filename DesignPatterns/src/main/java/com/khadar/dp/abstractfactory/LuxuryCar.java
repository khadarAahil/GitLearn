package com.khadar.dp.abstractfactory;

import com.khadar.dp.simplefactory.CarType;

public class LuxuryCar extends Car{

    public LuxuryCar(Location location){
        super(CarType.LUXURY);
        construct();
    }
    @Override
    public void construct() {

        // Construction process of luxury car process
    }
}
