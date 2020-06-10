package javaStudy.javaClass;

public class CarExample {
    public static void main(String[] args) {
        // 객체 생성
        Car car = new Car();

        System.out.println(car.company);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.maxSpeed);
        System.out.println(car.speed);

        car.speed = 60;
        System.out.println(car.speed);
    }
}
