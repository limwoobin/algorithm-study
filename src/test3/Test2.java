package test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    private static int[] arr = {1,2,12,14,15};
    private static int k = 2;

    public static void main(String[] args) {
        List<Integer> groupValueDifferenceList = getIndexDifferenceList(arr);
        Collections.sort(groupValueDifferenceList , Collections.reverseOrder());
        int result = getMinimumSumOfGroups(groupValueDifferenceList);

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

    private static int getMinimumSumOfGroups(List<Integer> groupValueDifferenceList) {
        int result = 0;

        for (int i=k-1; i<groupValueDifferenceList.size(); i++) {
            result += groupValueDifferenceList.get(i);
        }

        return result;
    }
}
