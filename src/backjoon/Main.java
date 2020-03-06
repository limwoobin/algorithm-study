package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = Integer.parseInt(br.readLine());
		for(int i=0; i<cnt; i++) {
			String[] arr = br.readLine().split(" ");
			int height = Integer.parseInt(arr[0]);
			int width = Integer.parseInt(arr[1]);
			int num = Integer.parseInt(arr[2]);

			String result = "";
			int h = num / height;
			if(h > 0 && num != height) {
				if(num % height == 0) {
					result = result.concat(Integer.toString(height));
					if(h < 10) {
						result = result.concat("0").concat(Integer.toString(h));
					}else {
						result = result.concat(Integer.toString(h));
					}
				}else {
					result = result.concat(Integer.toString(num % height));
					if(h < 10) {
						result = result.concat("0").concat(Integer.toString(h+1));
					}else {
						result = result.concat(Integer.toString(h+1));
					}
				}
			}else {
				result = result.concat(Integer.toString(num)).concat("01");
			}
			System.out.println(result);
		}
	}
}