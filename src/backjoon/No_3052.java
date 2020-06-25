package backjoon;

import java.util.Scanner;

public class No_3052 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0;
        boolean[] checked = new boolean[42];
        for(int i=0; i<10; i++) {
            int a = in.nextInt();
            if(!checked[a % 42]) {
                count++;
            }
            checked[a % 42] = true;
        }
        System.out.println(count);
    }
}
