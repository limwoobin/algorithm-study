package test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(11 , 100 , 0));
        Scanner scanner = new Scanner(System.in);

        System.out.println("N 입력");
        int N = scanner.nextInt();
        arr.add(N);

        int answer = 0;
        answer = lcm(arr);
        System.out.println(answer);
    }

    static int lcm(List<Integer> arr) {
        int num = arr.get(0);
        int min = 0;
        int max = 0;

        for (int i=1; i<arr.size(); i++) {
            if (arr.get(i) == 0) continue;
            min = Math.min(num , arr.get(i));
            max = Math.max(num , arr.get(i));

            num = min / gcd(min , max) * max / gcd(min , max) * gcd(min , max);
        }

        return num;
    }

    static int gcd(int min , int max) {
        if (max == 0) {
            return min;
        }

        return gcd(max , min % max);
    }
}
