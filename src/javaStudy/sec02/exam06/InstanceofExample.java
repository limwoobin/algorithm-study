package javaStudy.sec02.exam06;

public class InstanceofExample {
    public static void method1(Parent parent) {
        if (parent instanceof Child) {
            Child child = (Child) parent;
            System.out.println("method1 - Child 로 변환");
        } else {
            System.out.println("method1 - Child 로 변환 실패");
        }
    }

    public static void method2(Parent parent) {
        Child child = (Child) parent;
        System.out.println("Child 로 변환 성공");
    }

    public static void main(String[] args) {
        Parent parentA = new Child();
        method1(parentA);
        method2(parentA);

        Parent parentB = new Parent();
        method1(parentB);
        method2(parentB);
    }
}
