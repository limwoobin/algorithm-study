package backjoon;

import java.io.IOException;
import java.util.Scanner;

public class test {
	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        for(int i  = 0; i< cnt; i++) {
            int height = sc.nextInt();
            int width = sc.nextInt();
            int num = sc.nextInt();
            int x = (num/height) + 1;
            int y = num%height;
            if(num%height==0) {
                x = num/height;
                y = height;
            }
            System.out.println(y*100+x);
        }
	}
}
