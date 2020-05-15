package backjoon;

import java.util.Scanner;

public class No_1157 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);

	        String read = in.next();
	        read = read.toUpperCase();
	        int[] arr = new int[26];
	        for(int i=0; i<read.length(); i++) {
	            arr[(int)(byte)read.charAt(i) - 65] = arr[(int)(byte)read.charAt(i) - 65] + 1;
	        }

	        int max = arr[0];
	        int maxIdx = 0;
	        int maxChk = 0;
	        for(int j=0; j<arr.length; j++) {
	            if(max < arr[j]) {
	                max = arr[j];
	                maxIdx = j;
	            }
	        }
	        for(int j=0; j<arr.length; j++) {
	            if((max == arr[j]) && (j != maxIdx)) {
	                maxChk++;
	            }
	        }

	        maxIdx = maxIdx + 65;

	        if(maxChk > 0) {
	            System.out.println("?");
	        }else {
	            System.out.println((char) maxIdx);
	        }
	}

}
