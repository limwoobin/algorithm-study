package backjoon;

import java.io.IOException;

public class test {
	public static void main(String[] args) throws IOException {
		test t = new test();

		int[] arr = {3,1,8,7,2,5,4,6};
		int number = arr.length;
		int start = 0;

		t.sort(arr , start , number-1);
		for(int i=0; i<number; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void sort(int[] data , int l , int r) {
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();

		int left = l;
		int right = r;
		int pivot = data[(l+r) / 2];

		do {
			while(data[left] < pivot) left++;
			while(data[right] > pivot) right--;
			if(left <= right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}
		}while(left <= right);
		System.out.println("l:" + l);
		System.out.println("r:" + r);
		if(l < right) sort(data , l ,right);
		if(r > left) sort(data , left , r);
	}
}