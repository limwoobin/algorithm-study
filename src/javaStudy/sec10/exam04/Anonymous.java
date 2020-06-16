package javaStudy.sec10.exam04;

import javaStudy.sec01.exam03.Calculator;

public class Anonymous {
    private int field;

    public void method1(final int arg1 , int arg2) {
        final int var1 = 0;
        int var2 = 0;

        field = 10;

        Calculatable calc = new Calculatable() {
            @Override
            public int sum() {
                int result = field + arg1 + arg2 + var1 + var2;
                return result;
            }
        };

        System.out.println(calc.sum());
    }
}
