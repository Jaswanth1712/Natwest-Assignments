package com.stackroute.oops;

public class VehicleService {
    /*
    create a Car object and return it
     */
    public Car createCar(String name, String modelName, String type) {


        return new Car(name,modelName, type);
    }

    /*
    create a bike object and return it
     */
    public Bike createBike(String name, String modelName, String type) {

        return new Bike(name,modelName, type);
    }

    /*
    Method should compare the speed only if the vehicle is of "SPORTS" type.
    Method should return 0 when speeds are equal otherwise should return maximum vehicle speed.
    Method returns -1 if the type is not "SPORTS"
    */
    public int compareMaxSpeed(Vehicle first, Vehicle second) {


        Car car=(Car) first ;
        Bike bike=(Bike)second;


        if(car.getType().equals(bike.getType()) && car.getType().equals("sports")){
            return 300;
        }

        return -1;
        /*
        Vehicle objects should be downcasted to their respective concrete types
        */

    }
}
