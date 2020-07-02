package backjoon;

import java.util.Scanner;

public class No_8393 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int sum = 0;
        for(int i=1; i<=count; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
