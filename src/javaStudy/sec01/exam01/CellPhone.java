package javaStudy.sec01.exam01;

public class CellPhone {
    String model;
    String color;

    void powerOn() {
        System.out.println("전원을 킨다.");
    }

    void powerOff() {
        System.out.println("전원을 끈다.");
    }

    void bell() {
        System.out.println("벨이 울린다.");
    }

    void sendVoice(String message) {
        System.out.println("나:" + message);
    }

    void recceiveVoice(String message) {
        System.out.println("상대방:" + message);
    }

    void hangUp() {
        System.out.println("전화 끊기");
    }
}
