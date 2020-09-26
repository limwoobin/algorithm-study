package backjoon;

import java.util.Scanner;

public class No_11022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        for(int i=1; i<=count; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println("Case #"+i+": " + a + " + " + b + " = " + (a+b));
        }
    }
}
