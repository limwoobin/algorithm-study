package test;


class SuperClass {
    public SuperClass(String str) {
        System.out.println("파라미터가 있는 부모 생성자" + str);
    }

    public SuperClass() {
        System.out.println("기본 부모 생성자!!");
    }
}

class SubClass extends SuperClass {
    public SubClass() {
        super("AAA");
        System.out.println("자식 기본 생성자");
    }
}

public class InheritClass {
    public static void main(String[] args) {
        SubClass sc = new SubClass();
    }
}
