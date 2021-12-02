package com.khadar.dp.abstractfactory;

import com.khadar.dp.simplefactory.CarType;

public class AbstractFactoryTest {
    public static void main(String[] args) {

        Location location = Location.ASIA;
        CarType carType = CarType.LUXURY;
        try {
            Car car = new CarFactory().buildCar(location, carType);
            System.out.println(car.toString());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        Location location1 = Location.USA;
        CarType carType1 = CarType.SMALL;
        try {
            Car car = new CarFactory().buildCar(location1, carType1);
            System.out.println(car.toString());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
