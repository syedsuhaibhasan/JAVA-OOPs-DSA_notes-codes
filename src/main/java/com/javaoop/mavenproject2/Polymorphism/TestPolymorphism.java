package com.javaoop.mavenproject2.Polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        //subclass obj
        Car car = new Car();
        //super class object
        Vehicle vehicle = new Vehicle();
        //Reference of Superclass and using object of Sublcass this is called upcasting
        //But subclass reference cannot be used to make supercalss object
        Vehicle vCar = new Car();
        //gives error
        //but we use casting to ignore error but if we run this program we'l get error 
        
        //this called downcasting
//       Car carv = (Car) new Vehicle();

//        testCasting(vehicle);
//        //in this arguement method can also take subclass object also
//        testCasting(car);
        vehicle.start();
        car.start();
    }
    
    //in arguement it takes super calss obj
    //but we want to use car obj so we'll downcast
//    public static void testCasting(Vehicle veh){
//    Car carv = (Car) new Vehicle();
//    //by using downcasting superclass can use vehicle methods as well
//    carv.start();
//    carv.noOfDoors();
//    }
}
