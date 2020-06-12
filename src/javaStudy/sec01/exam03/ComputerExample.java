package javaStudy.sec01.exam03;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println(calculator.areaCircle(r));

        Computer computer = new Computer();
        System.out.println(computer.areaCircle(r));
    }
}
