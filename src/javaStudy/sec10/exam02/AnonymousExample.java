package javaStudy.sec10.exam02;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();

        // 익명 객체 필드 사용
        anonymous.field.turnOn();

        //로컬 변수 사용
        anonymous.method1();

        anonymous.method2(
                new RemoteControl(){

                    @Override
                    public void turnOn() {
                        System.out.println("Smart TV 켠다");
                    }

                    @Override
                    public void turnOff() {
                        System.out.println("Smart TV 끈다");
                    }
                });
    }
}
