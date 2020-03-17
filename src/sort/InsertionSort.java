package sort;

public class InsertionSort {

	public static void main(String[] args) {
		// 각 숫자를 적절한 위치에 삽입
		int i,j,temp;
		int[] arr = {1,10,5,8,7,6,4,3,2,9};
		for(i=0; i<arr.length-1; i++) {
			j=i;
			while(arr[j] > arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j--;
			}
		}

		for(i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
// 복잡도 -> O(N^2)