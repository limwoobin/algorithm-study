package backjoon;

import java.util.Scanner;

public class No_2775 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();
        for(int i=0; i<cnt; i++) {
            int k = in.nextInt();
            int n = in.nextInt();
            System.out.println(recursiveFunc(k,n));
        }
    }

    private static int recursiveFunc(int k , int n) {
        if(n == 0) {
            return 0;
        }else if(k == 0) {
            return n;
        }else {
            return recursiveFunc(k , n-1) + recursiveFunc(k -1 , n);
        }
    }
}
