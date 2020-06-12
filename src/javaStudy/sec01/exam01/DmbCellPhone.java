package javaStudy.sec01.exam01;

public class DmbCellPhone extends CellPhone {

    int channel;

    DmbCellPhone(String model , String color , int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb() {
        System.out.println(channel + "번 방송 수신");
    }

    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println(channel + "채널로 변경");
    }

    void turnOffDmb() {
        System.out.println("DMB 끄기");
    }
}
