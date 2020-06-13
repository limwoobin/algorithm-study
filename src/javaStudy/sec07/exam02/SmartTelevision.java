package javaStudy.sec07.exam02;

import javaStudy.sec07.exam01.RemoteControl;

public class SmartTelevision implements RemoteControl , Searchable {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV On");
    }

    @Override
    public void turnOff() {
        System.out.println("TV Off");
    }

    @Override
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

    @Override
    public void search(String url) {
        System.out.println(url + "검색");
    }
}
