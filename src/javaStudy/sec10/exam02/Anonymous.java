package javaStudy.sec10.exam02;

public class Anonymous {
    //필드 초기값으로 대입
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("티비를 켠다");
        }

        @Override
        public void turnOff() {
            System.out.println("티비를 끈다.");
        }
    };

    void method1() {
        // 로컬변수값
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Audio 켠다");
            }

            @Override
            public void turnOff() {
                System.out.println("Audio 끈다");
            }
        };
        localVar.turnOn();
    }

    void method2(RemoteControl rc) {
        rc.turnOn();
    }
}
