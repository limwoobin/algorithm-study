package backjoon;

public class test2 {
	public static void main(String[] args) {
		test2 t2 = new test2();
		int[] arr = {3,1,5,7,6,8,2,4};
		t2.quickSort(arr , 0 , arr.length-1);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void quickSort(int data[] , int l , int r) {
		int left = l;
		int right = r;
		int pivot = data[(l + r) / 2];
//		int pivot = data[l];

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
		if(l < right) quickSort(data , l , right);
		if(r > left) quickSort(data , left , r);
	}
}
