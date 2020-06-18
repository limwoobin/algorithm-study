package javaStudy.sec13.exam02;

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("실행 스레드 이름:" + mainThread.getName());

        ThreadA threadA = new ThreadA();
        System.out.println("작업스레드 이름:" + threadA.getName());
        threadA.start();

        ThreadB threadB = new ThreadB();
        System.out.println("작업스레드 이름:" + threadB.getName());
        threadB.start();
    }
}
