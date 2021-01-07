package test4;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    private static int arr[] = {1,2,3,3,5,4,3,2,6,7,1,7,5};

    public static void main(String[] args) {
        Map<Integer , Integer> map = new HashMap<>();
        for (int i=0; i< arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 0);
            }

            map.put(arr[i], map.get(arr[i]) + 1);
        }

        for (Integer i : map.keySet()) {
            System.out.println(i + " : " + map.get(i));
        }
    }
}
