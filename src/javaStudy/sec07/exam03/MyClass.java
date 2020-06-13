package javaStudy.sec07.exam03;

import javaStudy.sec07.exam01.Audio;
import javaStudy.sec07.exam01.RemoteControl;
import javaStudy.sec07.exam01.Television;

public class MyClass {

    RemoteControl rc = new Television();

    MyClass() {

    }

    MyClass(RemoteControl rc) {
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }

    void MethodA() {
        RemoteControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
    }

    void MethodB(RemoteControl rc) {
        rc.turnOn();
        rc.setVolume(5);
    }
}
