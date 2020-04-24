package sort;

public class MergeStudy {
	public static void main(String[] args) {
		MergeStudy ms = new MergeStudy();
		int arr[] = {2,3,1,5,6,4,7,8};
		int newArr[] = new int[arr.length];
		ms.mergeSort(arr , 0 , arr.length-1);

		for(int i=0; i<newArr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void merge(int arr[] , int m , int middle , int n) {

	}

	public void mergeSort(int arr[] , int m , int n) {
		int middle;
		if(m < n) {
			System.out.println(m + "," + n);
			middle = (m+n)/2;
			mergeSort(arr , m , middle);
			mergeSort(arr , middle + 1 , n);
//			merge(arr , m , middle , n);
		}
	}
}
