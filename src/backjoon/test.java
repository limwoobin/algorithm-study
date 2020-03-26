package backjoon;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {

		int num = 3;
		int num2 = 3;
		test(num);
	}

	public static void test(int n) {
		if(n == 0 || n ==  6) {
			return;
		}else {
			System.out.println(n);
			test(n-1);
			test(n+1);
		}
	}
}
