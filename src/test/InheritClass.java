package test;


class SuperClass {
    public SuperClass(String str) {
        System.out.println("부모 기본 생성자" + str);
    }

    public SuperClass() {

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
