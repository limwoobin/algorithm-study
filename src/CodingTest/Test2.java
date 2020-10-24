package CodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {
    private static int arr[][] = {{4, 1}, {3, 1}, {2, 1}, {4, 0}, {1, 1}, {1, 0}, {4, 1}, {4, 0}};
    private static int k = 3;
    private static int roomCount = 2;

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            if (arr[i][1] == 1) {
                if (values.size() < k) {
                    values.add(arr[i][0]);
                    continue;
                }
                temp.add(arr[i][0]);
            } else {
                if (temp.contains(Integer.valueOf(arr[i][0]))) {
                    temp.remove(Integer.valueOf(arr[i][0]));
                } else {
                    values.remove(Integer.valueOf(arr[i][0]));
                    if (temp.size() > 0) {
                        values.add(temp.get(0));
                        temp.remove(0);
                    }
                }
            }
        }

        Collections.sort(values);
        int results[] = convertIntArray(values);

        for (int i=0; i<results.length; i++) {
            System.out.println(results[i]);
        }
    }

    static int[] convertIntArray(List<Integer> list) {
        Integer result[] = list.toArray(new Integer[list.size()]);
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }
}
