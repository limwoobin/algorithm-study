package backjoon;

import java.util.Scanner;

public class No_10809 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();

        int[] arr = new int[123];

        for(int j=97; j<=122; j++) {
            int cnt = 0;
            for(int i=0; i<a.length(); i++) {
                if((byte)a.charAt(i) == j && arr[j] == 0) {
                    cnt++;
                    arr[j] = j;
                    System.out.print(i + " ");
                }
            }
            if(cnt == 0) {
                System.out.print("-1" + " ");
            }
        }
    }
}
