package backjoon;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int v = in.nextInt();

		int cnt = 1;
		int su1 = a-b;
		if(a >= v) {
			System.out.println(1);
			return;
		}

		while(true) {
			cnt++;
			su1 = su1 + a;
			if(su1 >= v) {
				System.out.println(cnt);
				break;
			}
			su1 = su1 - b;
			System.out.println(cnt + "/" + su1);
			// 5 2 14
			// 4 1 17
			// 통일
		}
	}
}
