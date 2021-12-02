package com.khadar.dp.abstractfactory;

import com.khadar.dp.simplefactory.CarType;

public class CarFactory {

    private Location location;

    private CarType carType;

    private Car car;

    public Car buildCar(Location location, CarType carType) throws Exception{

        switch (location){
            case USA:
                car = new USACarFactory().buildCar(carType);
                break;
            case ASIA:
                car = new AsiaCarFactory().buildCar(carType);
                break;
            default:
                car = new DefaultCarFactory().buildCar(carType);
                break;
        }

        return car;
    }
}
