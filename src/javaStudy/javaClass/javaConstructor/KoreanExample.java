package javaStudy.javaClass.javaConstructor;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("박자바" , "012345-551654");
        System.out.println(k1.name);
        System.out.println(k1.ssn);

        Korean k2 = new Korean("김자바" , "2515235-341535");
        System.out.println(k2.name);
        System.out.println(k2.ssn);
    }
}
