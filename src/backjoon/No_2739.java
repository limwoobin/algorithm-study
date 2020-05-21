package backjoon;

import java.util.Scanner;

// 구구단
public class No_2739 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if(a>=1 && a<=9) {
            for(int i=1; i<=9; i++) {
                System.out.println(a + " * " + i + " = " + a*i);
            }
        }
    }
}
