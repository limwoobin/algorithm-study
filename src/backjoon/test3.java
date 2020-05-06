package backjoon;

public class test3 {
	private int sorted[] = new int[8];
	public static void main(String[] args) {
		System.out.println("Merge...");
		test3 t3 = new test3();
		int arr[] = {6,4,2,3,1,5,7,8};

		t3.mergeSort(arr , 0 , arr.length-1);
	}

	public void merge(int arr[] , int m , int middle , int n) {
		int i = m;
		int j = middle + 1;
		int k = m;
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
