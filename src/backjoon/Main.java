package backjoon;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		int[] arr = new int[num];
		int temp;
		for(int i=0; i<num; i++) {
			arr[i] = in.nextInt();
		}

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}



		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}