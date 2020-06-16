package javaStudy.sec11.exam01;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "a100";

        int var1 = Integer.parseInt(data1);
        int var2 = Integer.parseInt(data2);

        int result = var1 + var2;
        System.out.println(result);
    }
}
