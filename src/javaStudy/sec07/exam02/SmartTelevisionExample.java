package javaStudy.sec07.exam02;

import javaStudy.sec07.exam01.RemoteControl;

public class SmartTelevisionExample {

    public static void main(String[] args) {
        SmartTelevision tv = new SmartTelevision();

        RemoteControl rc = tv;
        Searchable searchable = tv;
    }
}
