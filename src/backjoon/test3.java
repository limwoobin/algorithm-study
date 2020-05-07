package backjoon;

public class test3 {
	static int sorted[] = new int[8];

	public static void main(String[] args) {
		test3 t3 = new test3();
		int arr[] = {6,4,2,3,1,5,7,8};

		t3.mergeSort(arr , 0 , arr.length-1);

		for(int i=0; i<sorted.length; i++){
			System.out.print(sorted[i] + " ");
		}
	}

	public void merge(int arr[] , int m , int middle , int n) {
		int i = m;  		 // 첫번째 부분집합 시작위치
		int j = middle + 1;  // 두번째 부분집합 시작위치
		int k = m;

		// 작은순서로 배열 삽입
		while(i <= middle && j <= n){
			if(arr[i] <= arr[j]){
				sorted[k] = arr[i];
				i++;
			}else{
				sorted[k] = arr[j];
				j++;
			}
			k++;
		}

		if(i > middle){
			for(int t=j; t<=n; t++){
				sorted[k] = arr[t];
				k++;
			}
		}else{
			for(int t=i; t<=middle; t++){
				sorted[k] = arr[t];
				k++;
			}
		}

		for(int t=m; t<=n; t++){
			arr[t] = sorted[t];
		}
	}

	public void mergeSort(int arr[] , int m , int n) {
		int middle;
		if(m < n) {
			middle = (m+n)/2;
			mergeSort(arr , m , middle);
			mergeSort(arr , middle + 1 , n);
			merge(arr , m , middle , n);
		}
	}
}
