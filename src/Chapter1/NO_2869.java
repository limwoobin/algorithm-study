package Chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NO_2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = br.readLine().split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int v = Integer.parseInt(arr[2]);
		int cnt = 1;
		int val = a - b;
		v = v - a;
		int su = v/val;

		if(v - (val*su) <= 0) {
			cnt = cnt + su;
		}else {
			cnt = cnt + su + 1;
		}
		System.out.println(cnt);
	}
}
