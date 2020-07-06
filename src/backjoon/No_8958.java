package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int fr = Integer.parseInt(br.readLine());

        for(int i=0; i<fr; i++) {
            String a = br.readLine();

            String[] arr = a.split("");

            int sum = 0;
            int temp = 0;
            for(int j=0; j<arr.length; j++) {
                if("X".equals(arr[j])) {
                    temp = 0;
                }else {
                    temp = temp + 1;
                }
                sum = sum + temp;
            }

            System.out.println(sum);
        }
    }
}
