package sort;

public class SelectionSort {
	public static void main(String[] args) {
		// 가장 작은값을 선택해 제일 앞으로
		int i , j , min , index = 0 , temp;
		int[] arr = {1,10,5,8,7,6,4,3,2,9};
		for(i=0; i<arr.length; i++) {
			min = 9999;
			for(j=i; j<arr.length; j++) {
				if(min > arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
			//swap
		}

		for(i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}


// ->  시간복잡도 O(N^2)
