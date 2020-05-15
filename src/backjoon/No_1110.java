package backjoon;

import java.util.Scanner;

public class No_1110 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int a = in.nextInt();
	        int count = 0;
	        int result = a;

	        while(true) {
	            count++;
	            String temp;
	            String[] temp2;
	            if(a < 10) {
	                temp = "0".concat(String.valueOf(a));
	            }else {
	                temp = String.valueOf(a);
	            }
	            temp2 = temp.split("");

	            String lastNum = temp2[1];
	            String lastHap = String.valueOf(Integer.parseInt(temp2[0]) + Integer.parseInt(temp2[1]));
	            String nextNum = lastNum.concat(lastHap.substring(lastHap.length()-1, lastHap.length()));
	            if(result == Integer.parseInt(nextNum)) {
	                System.out.println(count);
	                break;
	            }else {
	                a = Integer.parseInt(nextNum);
	            }
	        }
	}

}
