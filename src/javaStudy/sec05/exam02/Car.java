package javaStudy.sec05.exam02;

public class Car {
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.speed = 50;
        car.run();
    }
}
