package sort;

public class QuickSort {
	public static void main(String[] args) {
		// 분할 정복 알고리즘
		// Pivot 을 중심으로 L과 R값을 지정
		// L은  Pivot 보다 큰 값 , R은   Pivot 보다 작은 값
		// 두개 모두 선택되었다면 자리 교환
		// 만약 한쪽이 선택된 L이나 R이 없으면 선택된 값과 Pivot 교환

		int number = 10;
		int[] arr = {3,7,8,1,5,9,6,10,2,4};
		QuickSort qs = new QuickSort();
		qs.sort(arr, 0, number-1);
		for(int i=0; i<number; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void sort(int[] data , int l , int r) {
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

		if(l < right) sort(data , l , right);
		if(r > left) sort(data , left , r);
	}
}

// 시간복잡도 -> O(N*logN)
// 최악의 복잡도는 O(N^2)
// 하지만 일반적으로 퀵소트가 머지 , 힙 소트보다 더 빠르다
// 이유는 스왑비용이 적고 지역적 특성이 있기 때문