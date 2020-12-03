package test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class No2 {
    private static int[] arr = {1, 3 , 5 , 7 , 9};
    private static List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        while (true) {
            if (list.isEmpty()) {
                break;
            }

            if (arr.length % 2 == 0) {
                evenOperator(list1 , list2);
            } else {
                oddOperator(list1 , list2);
            }

            list.remove(Integer.valueOf(Collections.max(list)));
        }

        System.out.println(Math.abs(checkSize(list1 , list2)));
    }

    static void oddOperator(List<Integer> list1 , List<Integer> list2) {
        if (sum(list1) > sum(list2)) {
            if (Collections.max(list) > checkSize(list1 , list2) &&
                    sum(list) - Collections.max(list) > Collections.max(list)) {
                list1.add(Collections.max(list));
            } else {
                list2.add(Collections.max(list));
            }
        } else {
            if (Collections.max(list) > checkSize(list2 , list1) &&
                    sum(list) - Collections.max(list) > Collections.max(list)) {
                list2.add(Collections.max(list));
            } else {
                list1.add(Collections.max(list));
            }
        }
    }

    static void evenOperator(List<Integer> list1 , List<Integer> list2) {
        if (sum(list1) > sum(list2)) {
            list2.add(Collections.max(list));
        } else {
            list1.add(Collections.max(list));
        }
    }

    static int checkSize(List<Integer> list1 , List<Integer> list2) {
        return sum(list1) - sum(list2);
    }

    static int sum(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        return sum;
    }
}
