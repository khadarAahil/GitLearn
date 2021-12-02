package com.khadar.dp.simplefactory;

public class TestFactoryPattern {
    public static void main(String[] args) {


        try {
            Car smallCar  = new CarFactory().buildCar(CarType.SMALL);
            Car sedanCar  = new CarFactory().buildCar(CarType.SEDAN);
            Car luxuryCar  = new CarFactory().buildCar(CarType.LUXURY);
            System.out.println("Small car: "+smallCar.toString()+", " +
                    "Sedan car: "+sedanCar.toString()+"," +
                    " Luxury car: "+luxuryCar.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
