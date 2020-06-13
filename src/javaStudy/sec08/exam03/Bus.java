package javaStudy.sec08.exam03;

public class Bus implements Vehicle {

    @Override
    public void run() {
        System.out.println("Bus run");
    }

    public void checkFare() {
        System.out.println("승차요금 체크");
    }
}
