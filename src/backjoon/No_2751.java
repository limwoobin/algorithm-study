package backjoon;

import java.util.Scanner;

public class No_2751 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        int[] sorted = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = in.nextInt();
        }
        mergeSort(arr , 0 , arr.length-1 , sorted);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge(int arr[] , int m , int middle , int n, int[] sorted) {
        int i = m;
        int j = middle + 1;
        int k = m;

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

        for(int t = m; t <= n; t++) {
            arr[t] = sorted[t];
        }
    }

    public static void mergeSort(int[] arr , int m , int n , int[] sorted) {
        if(m < n) {
            int middle = (m + n) / 2;
            mergeSort(arr,m,middle , sorted);
            mergeSort(arr,middle+1,n , sorted);
            merge(arr,m,middle,n , sorted);
        }
    }
}
