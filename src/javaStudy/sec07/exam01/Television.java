package javaStudy.sec07.exam01;

import java.rmi.Remote;

public class Television implements RemoteControl {
    private int volume;

    public void turnOn() {
        System.out.println("TV를 킨다");
    }

    public void turnOff() {
        System.out.println("TV를 끈다");
    }

    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
           this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUNE) {
            this.volume = RemoteControl.MIN_VOLUNE;
        } else {
            this.volume = volume;
        }

        System.out.println("TV 볼륨:" + this.volume);
    }
}
