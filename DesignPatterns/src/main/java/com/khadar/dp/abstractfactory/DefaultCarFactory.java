package com.khadar.dp.abstractfactory;

import com.khadar.dp.simplefactory.CarType;

public class DefaultCarFactory {

    private Car car;

    public Car buildCar(CarType carType) throws Exception {

        if (!CarTypeValidateUtil.validateCarType(carType)){
            throw new Exception("Car type is empty!");
        }

        switch (carType){

            case LUXURY:
                car = new LuxuryCar(Location.DEFAULT);
                break;
            case SEDAN:
                car = new SedanCar(Location.DEFAULT);
                break;
            case SMALL:
                car = new SmallCar(Location.DEFAULT);
                break;
            default:
                throw new Exception("Car type does not matched.");
        }

        return car;
    }



}
