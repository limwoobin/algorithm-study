package backjoon;

import java.util.Scanner;

public class No_2884 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if(b-45 < 0) {
            b = b+60-45;
            if(a-1<0) {
                a = 24-1;
            }else {
                a = a-1;
            }
        }else {
            b = b-45;
        }

        System.out.println(a);
        System.out.println(b);
    }
}
