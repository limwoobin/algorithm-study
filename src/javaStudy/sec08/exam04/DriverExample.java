package javaStudy.sec08.exam04;

import javaStudy.sec08.exam03.Bus;
import javaStudy.sec08.exam03.Taxi;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);
    }
}
