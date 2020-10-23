package backjoon;

import java.util.Scanner;

public class No_11720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String num = in.next();

        int sum = 0;
        for(int i=0; i<a; i++) {
            sum = sum + Integer.parseInt(num.substring(i, i+1));
        }

        System.out.println(sum);
    }
}
