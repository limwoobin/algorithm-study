package Chapter1;

import java.util.Scanner;

public class No_10250 {

	public static void main(String[] args) {
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
