package backjoon;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {

		int num = 5;
		recursive(num , "");
	}

	public static void printNum(int n) {
		System.out.println("PN:" + n);
	}


	public static void recursive(int n , String s) {
		if(n >= 1) {
			if("a".equals(s)) {
				System.out.println("VC");
			}
			System.out.println("RC:" + n);

			recursive(n , "");
			recursive(n , "a");
			printNum(n);
			n--;
		}
	}
}


