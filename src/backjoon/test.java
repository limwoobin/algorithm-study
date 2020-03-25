package backjoon;

public class test {
	public static void main(String[] args) {
		int number=10;
		int[] arr = {2,3,1,6,8,10,7,5,4,9};
		quick(arr , 0 , number-1);
		for(int i=0; i<number; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void quick(int[] arr , int start , int end) {
		if(start >= end) {
			return;
		}

		int temp;
		int pivot = start;
		int i = start + 1;
		int j = end;

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

		quick(arr , start , j-1);
		quick(arr , j+1 , end);
	}
}
