package javaStudy.sec07.exam01;

public interface RemoteControl {

    // 상수
    public int MAX_VOLUME = 10;
    public int MIN_VOLUNE = 0;

    // 추상 메소드
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);
}
