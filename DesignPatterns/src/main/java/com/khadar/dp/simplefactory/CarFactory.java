package com.khadar.dp.simplefactory;

public class CarFactory {

    private Car car;

    public Car buildCar(CarType carType) throws Exception {

        switch (carType){

            case SMALL:
                car = new SmallCar();
                break;

            case SEDAN:
                car = new SedanCar();
                break;
            case LUXURY:
                car = new LuxuryCar();
                break;
            default:
                throw new Exception("Car model does match.");

        }
        return car;
    }
}
