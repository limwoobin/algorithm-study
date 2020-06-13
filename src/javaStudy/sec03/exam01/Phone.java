package javaStudy.sec03.exam01;

public abstract class Phone {
    public String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public void turnOn() {
        System.out.println("전원 온");
    }

    public void turnOff() {
        System.out.println("전원 오프");
    }
}
