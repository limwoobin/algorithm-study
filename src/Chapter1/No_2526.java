package Chapter1;

import java.util.Scanner;

public class No_2526 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i=0; i<9; i++) {
            arr[i] = in.nextInt();
        }

        int max = arr[0];
        int index = 0;
        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) max = arr[i];
        }

        for(int i=0; i<arr.length; i++) {
            if(max == arr[i]) {
                index = i+1;
            }else {
                continue;
            }
        }
        System.out.println(max);
        System.out.println(index);
	}
}
