package test;

public class testMerge {
    static int sorted[] = new int[10];
    public static void main(String[] args){
        testMerge tm = new testMerge();
        int arr[] = {2,3,1,5,8,6,4,7,10,9};
        tm.mergeSort(arr , 0 , arr.length-1);

        for(int i=0; i<sorted.length; i++){
            System.out.print(sorted[i] + " ");
        }
    }

    public void merge(int arr[] , int m , int middle , int n){
        int i = m;
        int j = middle + 1;
        int k = m;

        while (i <= middle && j <= n){
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

    public void mergeSort(int arr[] , int m , int n){
        int middle;
        if(m < n){
            middle = (m+n)/2;
            mergeSort(arr , m , middle);
            mergeSort(arr , middle + 1 , n);
            merge(arr , m , middle , n);
        }
    }
}
