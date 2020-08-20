package backjoon;

import java.util.Scanner;

public class No_10818 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = in.nextInt();

        int[] arr = new int[a];
        for(int i=0; i<a; i++) {
            arr[i] = in.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
