package javaStudy.sec12.exam04;

import javaStudy.sec02.exam03.Car;

public class ClassExample {
    public static void main(String[] args) throws Exception {
        Class clazz = Car.class;
        Class clazz2 = Class.forName("javaStudy.sec02.exam03.Car");
        Car car = new Car();
        Class clazz3 = car.getClass();


        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackage().getName());

        System.out.println(clazz2);
        System.out.println(clazz3);
    }
}
