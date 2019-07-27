package dp.sda.flywight;

import dp.sda.abstractFactory.Color;

import java.util.Timer;

import static dp.sda.flywight.VehicleFactory.createVehicle;

public class Sandbox {

    public static void main(String[] args) {

        long startToCreateCar = System.currentTimeMillis();
        //Car newCar = new Car(engine, "green");
        createVehicle("green");

        long endTimeForCreatingCar = System.currentTimeMillis();
        java.lang.System.out.println("New green car created in " + (endTimeForCreatingCar - startToCreateCar));

        startToCreateCar = System.currentTimeMillis();

        createVehicle("green");

        endTimeForCreatingCar = System.currentTimeMillis();
        java.lang.System.out.println("Another green car created in " + (endTimeForCreatingCar - startToCreateCar));

        startToCreateCar = System.currentTimeMillis();

        createVehicle("red");

        endTimeForCreatingCar = System.currentTimeMillis();
        java.lang.System.out.println("New red car created in " + (endTimeForCreatingCar - startToCreateCar));
    }
}