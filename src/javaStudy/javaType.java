package javaStudy;

public class javaType {
    public static void main(String[] args) {
        int a = 123;
        System.out.printf("%06d" , a);

        System.out.println();
        int x = -100;
        System.out.println(+x);
        System.out.println(-x);

        byte b1 = 10;
        byte b2 = 15;
        int result = b1 + b2;
        System.out.println(result);

        char c1 = 'A';
        System.out.println(c1);
        int b = 'B';
        System.out.println(b);

        float f1 = 0.1f;
        System.out.println(f1);
        double d1 = f1;
        System.out.println(d1);

        double d2 = 0.1;
        float f2 = (float) d2;
        System.out.println(d2);
        System.out.println(f2);

        double d3 = 0.1f;
        System.out.println(d3);

        System.out.println(5/3);
    }
}
