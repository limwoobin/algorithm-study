package backjoon;

import java.util.Scanner;

public class No_5622 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String temp = in.next();
        String[] arr = new String[10];
        arr[2] = "ABC";
        arr[3] = "DEF";
        arr[4] = "GHI";
        arr[5] = "JKL";
        arr[6] = "MNO";
        arr[7] = "PQRS";
        arr[8] = "TUV";
        arr[9] = "WXYZ";

        int sum = 0;
        for(int i=2; i<=9; i++) {
            for(int j=0; j<temp.length(); j++) {
                if(arr[i].indexOf(String.valueOf(temp.charAt(j))) > -1) {
                    sum = sum + (i+1);
                }
            }
        }

        System.out.println(sum);
    }
}
