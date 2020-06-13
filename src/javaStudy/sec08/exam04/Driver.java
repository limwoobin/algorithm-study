package javaStudy.sec08.exam04;

import javaStudy.sec08.exam03.Bus;
import javaStudy.sec08.exam03.Vehicle;

public class Driver {
    public void drive(Vehicle vehicle) {
        if(vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        }
        vehicle.run();
    }
}
