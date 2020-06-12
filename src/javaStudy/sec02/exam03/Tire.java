package javaStudy.sec02.exam03;

public class Tire {
    // 필드
    public int maxRotation; // 최대회전수
    public int accumulatedRotation; // 누적회전수
    public String location; //  위치


    // 생성자
    public Tire(String location , int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    // 메소드
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation < maxRotation) {
            System.out.println("정상회전:" + (maxRotation - accumulatedRotation) + " 회");
            return true;
        } else {
            System.out.println(location + "타이어 펑크");
            return false;
        }
    }
}
