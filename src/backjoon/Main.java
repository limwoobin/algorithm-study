package backjoon;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = in.nextInt();
		}

		quickSort(arr , 0 , num-1);

		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void quickSort(int[] arr , int start , int end) {
		if(start >= end) {
			return ;
		}

		int pivot = start;
		int i = start + 1;
		int j = end;
		int temp;
		while(i <= j) {
			while(i <= end && arr[i] <= arr[pivot]) {
				i++;
			}
			while(j > start && arr[j] >= arr[pivot]) {
				j--;
			}
			if(i > j) {
				temp = arr[j];
				arr[j] = arr[pivot];
				arr[pivot] = temp;
			}else {
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		quickSort(arr , start , j-1);
		quickSort(arr , j+1 , end);
	}
}