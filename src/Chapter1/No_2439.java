package Chapter1;

import java.util.Scanner;

public class No_2439 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	     int count = in.nextInt();
         for(int i=1; i<=count; i++) {
             for(int k=count-1; k>=i; k--) {
                System.out.print(" ");
             }
             for(int j=count-i+1; j<=count; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
	}
}
