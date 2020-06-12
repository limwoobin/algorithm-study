package javaStudy.sec01.exam06;

public class Child extends Parent {
    private String name;

    public Child() {
        this("홍길동");
        System.out.println("Child Call");
    }

    public Child(String name) {
        this.name = name;
        System.out.println("CHild(String name) Call");
    }
}
