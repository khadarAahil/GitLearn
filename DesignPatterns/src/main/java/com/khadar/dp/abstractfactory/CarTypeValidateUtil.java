package com.khadar.dp.abstractfactory;

import com.khadar.dp.simplefactory.CarType;

public class CarTypeValidateUtil {

    public static boolean validateCarType(CarType carType){

        if (carType == null){
            return false;
        }
        return true;

    }
}
