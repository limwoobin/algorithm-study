package javaStudy.sec12.exam06;

public class StringIndexOfExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);

        if (subject.indexOf("자바") != -1) {
            System.out.println("자바와 관련됨");
        } else {
            System.out.println("자바와 관련없음");
        }
    }
}
