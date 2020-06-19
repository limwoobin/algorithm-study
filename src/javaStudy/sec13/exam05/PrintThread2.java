package javaStudy.sec13.exam05;

public class PrintThread2 extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("실행 중");
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {

        }

        System.out.println("실행 종료");
    }
}
