package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = Integer.parseInt(br.readLine());

		for(int i=0; i<cnt; cnt++) {
			String[] arr = br.readLine().split(" ");
			int height = Integer.parseInt(arr[0]);
			int width = Integer.parseInt(arr[1]);
			int num = Integer.parseInt(arr[2]);

			String result = "";
			int h = num / height;
			if(h > 0 && (num % height) != 0) {
				result = result.concat(Integer.toString(num % height));
				if(h < 10) {
					result = result.concat("0").concat(Integer.toString(h+1));
				}else {
					result = result.concat(Integer.toString(h+1));
				}
			}else {
				if(height > width) {
					result = result.concat(Integer.toString(num)).concat("01");
				}else {
					
				}
			}
			System.out.println(result);
		}
	}
}


//6 12 10 = 402
//30 50 72 = 1203
//
//5 7 8 = 302
//
//5 8 8 = 302
//
//5 9 8 = 302
//
//10 5 6 = 601