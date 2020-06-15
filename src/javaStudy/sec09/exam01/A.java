package javaStudy.sec09.exam01;

class A {

    A() {
        System.out.println("A 객체 생성");
    }

    class B {
        B() {
            System.out.println("B 객체 생성");
        }
        int field;
        void method1() {

        }
    }

    static class C {
        C() {
            System.out.println("C 객체 생성");
        }
        int field;
        static int field2;
        void method1() {

        }
        static void method2() {

        }
    }

    void method() {
        class D {
            D() {
                System.out.println("D 객체 생성");
            }
            int field;
            void method1() {

            }
        }
        D d = new D();
        d.field = 3;
        d.method1();
    }
}
