package test4;

public class Ex4 {
    static int[] makeArray() {
        int[] arr = new int[10000];

        for (int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random() * 20000) + 1;

            for (int j=0; j<i; j++) {
                if(arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }

        return arr;
    }

    public void quickSort(int[] data, int l, int r){
        int left = l;
        int right = r;
        int pivot = data[(l+r)/2];

        do{
            while(data[left] < pivot) left++;
            while(data[right] > pivot) right--;
            if(left <= right){
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }while (left <= right);

        if(l < right) quickSort(data, l, right);
        if(r > left) quickSort(data, left, r);
    }

    public static void main(String[] args) {
        int data[] = makeArray();
        Ex4 ex4 = new Ex4();
        ex4.quickSort(data, 0, data.length - 1);

        for(int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }

        int findIndex = binarySearch(4583 , data);
        System.out.println(findIndex);
    }

    private static int binarySearch(int key , int arr[]) {
        int mid = 0;
        int left = 0;
        int right = arr.length - 1;

        while (right >= left) {
            mid = (right + left) / 2;

            if (key == arr[mid]) {
                System.out.println(key + "," + mid);
                return mid;
            }

            if (key < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return 0;
    }
}
