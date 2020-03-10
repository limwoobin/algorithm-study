package Chapter1;

import java.util.Scanner;

public class No_1065 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int cnt = 0;
        for(int i=1; i<=a; i++) {
           if(i<100) {
               cnt++;
           }else {
               if(check(i)) cnt++;
           }
       }
       System.out.println(cnt);
	}

	public static boolean check(int n) {
        boolean check = false;

        int[] arr = new int[String.valueOf(n).length()];
        int seq = 0;
        while(n != 0) {
            arr[seq] = n%10;
            n /= 10;
            seq++;
        }

        for(int i=0; i<arr.length; i++) {
            int a = arr[arr.length - 1] - arr[arr.length - 2];
            int b = arr[arr.length - 2] - arr[arr.length - 3];
            if(a == b) check = true;
        }



        return check;
    }
}
