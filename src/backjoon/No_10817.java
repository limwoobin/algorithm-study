package backjoon;

import java.util.Scanner;

public class No_10817 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int big,middle,small;

        big = (a>b)&&(a>c)?a:(c>b?c:b);
        small = (b>a)&&(c>a)?a:(b>c?c:b);
        middle = (a>b)?((a>c)?((b>c)?b:c):a):((b>c)?((a>c)?a:c):b);

        System.out.println(middle);
    }
}
