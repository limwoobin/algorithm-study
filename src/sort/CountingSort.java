package sort;

public class CountingSort {
	// 5이하의 숫자들을 정렬
	public static void main(String[] args) {
		int temp;
		int count[] = new int[6];
		int array[] = {1,3,2,4,3,2,5,3,1,2,
					   3,4,4,3,5,1,2,3,5,2,
					   3,1,4,3,5,1,2,1,1,1};
		for(int i=1; i<=5; i++) {
			count[i] = 0;
		}

		for(int i=0; i<30; i++) {
			count[array[i]]++;
		}

		for(int i=1; i<=5; i++) {
			if(count[i] != 0) {
				for(int j=0; j<count[i]; j++) {
					System.out.print(" " + i);
				}
			}
		}
	}
}
