package sort;

public class MergeStudy {
	static int[] sorted = new int[8];
	public static void main(String[] args) {
		MergeStudy ms = new MergeStudy();
		int arr[] = {2,3,1,5,6,4,7,8};
		ms.mergeSort(arr , 0 , arr.length-1);

		for(int i=0; i<sorted.length; i++) {
			System.out.print(sorted[i] + " ");
		}
	}

	public void merge(int arr[] , int m , int middle , int n) {
		int i = m;		// 첫 번째 부분집합의 시작 위치 설정
		int j = middle + 1;	// 두 번째 부분집합의 시작 위치 설정
		int k = m;	// 배열 sorted에 정렬된 원소를 저장할 위치 설정

		while(i <= middle && j <= n) {
			if(arr[i] <= arr[j]) {
				sorted[k] = arr[i];
				i++;
			}else {
				sorted[k] = arr[j];
				j++;
			}
			k++;
		}

		if(i > middle) {
			for(int t=j; t<=n; t++) {
				sorted[k] = arr[t];
				k++;
			}
		}else {
			for(int t=i; t<=middle; t++) {
				sorted[k] = arr[t];
				k++;
			}
		}

		for(int t=m; t<=n; t++) {
			arr[t] = sorted[t];
		}
	}

	public void mergeSort(int arr[] , int m , int n) {
		int middle;
		if(m < n) {
			middle = (m+n)/2;
			mergeSort(arr , m , middle);		// 앞 부분에 대한 분할 작업 수행
			mergeSort(arr , middle + 1 , n);	// 뒷 부분에 대한 분할 작업 수행
			merge(arr , m , middle , n);		// 부분집합에 대하여 정렬과 병합 작업 수행
		}
	}
}
