package Chapter1;

import java.util.Scanner;

public class No_2588 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String c = String.valueOf(b);

        int b1 = c.charAt(0) - '0';
        int b2 = c.charAt(1) - '0';
        int b3 = c.charAt(2) - '0';

        System.out.println(a * b3);
        System.out.println(a * b2);
        System.out.println(a * b1);
        System.out.println(a*b);
    }
}
