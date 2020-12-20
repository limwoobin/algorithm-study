package backjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class No_13164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = scanner.nextInt();
        }

        List<Integer> groupValueDifferenceList = getIndexDifferenceList(arr);
        Collections.sort(groupValueDifferenceList , Collections.reverseOrder());
        int result = getMinimumSumOfGroups(groupValueDifferenceList , k);
        System.out.println(result);
    }

    private static List<Integer> getIndexDifferenceList(int[] arr) {
        List<Integer> diffList = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            if (i != arr.length -1) {
                diffList.add(arr[i+1] - arr[i]);
            }
        }

        return diffList;
    }

    private static int getMinimumSumOfGroups(List<Integer> groupValueDifferenceList , int k) {
        int result = 0;

        for (int i=k-1; i<groupValueDifferenceList.size(); i++) {
            result += groupValueDifferenceList.get(i);
        }

        return result;
    }
}
