package backjoon;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int sum = 1;
		int pV = 0;

		int k = in.nextInt();
		int n = in.nextInt();

		for(int i=0; i<k; i++) {
			for(int j=1; j<=n; j++) {
				sum = sum * j;
			}
			
		}

		System.out.println(sum);
	}
}