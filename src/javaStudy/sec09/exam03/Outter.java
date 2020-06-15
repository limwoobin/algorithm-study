package javaStudy.sec09.exam03;

public class Outter {
    // 자바7 이전
    public void method1(final int arg) {
        final int localVariable = 1;
        //arg = 100;
        //localVariable = 100;
        class Inner {
            public void method() {
                int result = arg + localVariable;
            }
        }
    }


    // 자바8 이후
    public void method2(int arg) {
        int localVariable = 1;
        //arg = 100;
        //localVariable = 100;
        class Inner {
            public void method() {
                int result = arg + localVariable;
            }
        }
    }

}
