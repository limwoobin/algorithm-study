package backjoon;

import java.util.Scanner;

public class No_2839 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int val1 = 3;
        int val2 = 5;
        int a = in.nextInt();

        int cnt = 0;
        int temp2 = a/val2;
        if(temp2 > 0) {
            if((temp2 > 0) && (a%val2 == 0)) {
                cnt = temp2;
                System.out.println(cnt);
            }else {
                for(int i=temp2; i>0; i--) {
                    cnt = 0;
                    int temp1 = a - (i*val2);
                    if((temp1/val1 > 0) && (temp1%val1 == 0)) {
                        cnt = i + (temp1/val1);
                        System.out.println(cnt);
                        return;
                    }
                }
                if((a/val1 > 0) && (a%val1 == 0)) {
                    cnt = a/val1;
                    System.out.println(cnt);
                }else {
                    System.out.println(-1);
                }
            }
        }else {
            if((a/val1 > 0) && (a%val1 == 0)) {
                cnt = a/val1;
                System.out.println(cnt);
            }else {
                cnt = -1;
                System.out.println(cnt);
            }
        }
    }
}
