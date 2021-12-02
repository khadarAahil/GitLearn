package com.khadar.dp.abstractfactory;

import com.khadar.dp.simplefactory.CarType;

public class AsiaCarFactory {

    private Car car;

    public Car buildCar(CarType carType) throws Exception {

        if (!validateCarType(carType)){
            throw new Exception("Car type is empty!");
        }

        switch (carType){

            case LUXURY:
                car = new LuxuryCar(Location.ASIA);
                break;
            case SEDAN:
                car = new SedanCar(Location.ASIA);
                break;
            case SMALL:
                car = new SmallCar(Location.ASIA);
                break;
            default:
                throw new Exception("Car type does not matched.");
        }

        return car;
    }

    private boolean validateCarType(CarType carType){

        if (carType == null){
            return false;
        }
        return true;

    }



}
