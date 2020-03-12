package backjoon;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int[] arr = new int[6];

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		int e = in.nextInt();

		arr[0] = a + d;
		arr[1] = a + e;
		arr[2] = b + d;
		arr[3] = b + e;
		arr[4] = c + d;
		arr[5] = c + e;

		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.println(min-50);
	}
}