package Chapter1;

import java.util.Scanner;

public class No_2438 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        for(int i=1; i<=count; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
