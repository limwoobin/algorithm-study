package javaStudy.sec07.exam03;

import javaStudy.sec07.exam01.Audio;
import javaStudy.sec07.exam01.Television;

public class MyClassExample {
    public static void main(String[] args) {
        System.out.println("1-----------------------");
        MyClass myClass1 = new MyClass();
        myClass1.rc.turnOn();
        myClass1.rc.setVolume(5);

        System.out.println("2-----------------------");
        MyClass myClass2 = new MyClass(new Audio());

        System.out.println("3-----------------------");
        MyClass myClass3 = new MyClass();
        myClass3.MethodA();

        System.out.println("4-----------------------");
        MyClass myClass4 = new MyClass();
        myClass4.MethodB(new Television());
    }
}
