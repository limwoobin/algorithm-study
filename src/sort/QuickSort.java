package sort;

public class QuickSort {
	public static void main(String[] args) {
		// 분할 정복 알고리즘
		// 1.pivot 값 정하기(보통 첫번째 자리)
		// 2.왼쪽에서 부터 pivot값 보다 큰 값을 선택
		// 3.오른쪽에서부터 pivot값 보다 작은 값을 선택
		// 4. 2번값과 3번값 교환
		// 5. 엇갈린 경우는 pivot값과 작은값을 교환
		// 6. 분할이 되었음
		// 7. 각 분할이 된 배열의 맨 앞자리가 pivot
		// 8. 앞에서 했더 작업 다시 수행

		int number = 10;
		int[] arr = {3,7,8,1,5,9,6,10,2,4};
		quickSort(arr , 0 , number-1);
		for(int i=0; i<number; i++) {
			System.out.print(arr[i] + " ");
		}
	}


	public static void quickSort(int[] arr , int start, int end) {
		if(start >= end) { // 원소가 1개인 경우
			return;
		}

		int pivot = start; // 피벗값은 첫번째 원소
		int i = start + 1;
		int j = end;
		int temp;

		while(i <= j) { // 엇갈릴 때까지 반복
			while(i <= end && arr[i] <= arr[pivot]) {
				i++;
			}
			while(j > start && arr[j] >= arr[pivot]) {
				j--;
			}
			if(i > j) { // 엇갈렸을때 ..
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

// 시간복잡도 -> O(N*logN)
// 최악의 복잡도는 O(N^2)
