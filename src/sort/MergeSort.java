package sort;

public class MergeSort {

	public static int number = 8;
	public static int size = 0;
	public static int[] sorted = new int[8];
	public static int count = 0;

	public static void main(String[] args) {
		// O(N * logN)
		int[] array = {7,6,2,8,3,5,4,1};
		mergeSort(array , 0 , number -1);
		for(int i=0; i<number; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void merge(int a[] , int m, int middle , int n) {
		int i = m;
		int j = middle + 1;
		int k = m;

		// 작은 순서대로 배열에 삽입한다
		while(i <= middle && j <= n) {
			if(a[i] <= a[j]) {
				sorted[k] = a[i];
				i++;
			}else {
				sorted[k] = a[j];
				j++;
			}
			k++;
		}
		// 남은 데이터도 삽입
		if(i > middle) {
			for(int t=j; t<=n; t++) {
				sorted[k] = a[t];
				k++;
			}
		}else {
			for(int t=i; t<=middle; t++) {
				sorted[k] = a[t];
				k++;
			}
		}

		//정렬된 배열 삽입
		for(int t = m; t <= n; t++) {
			a[t] = sorted[t];
		}
	}

	public static void mergeSort(int a[] , int m, int n) {
		// 이외의 경우는 크기가 1개인 경우
		if(m < n) {
			int middle = (m + n) / 2;
			mergeSort(a,m,middle);
			mergeSort(a,middle+1,n);
			merge(a,m,middle,n);
		}
	}
}
