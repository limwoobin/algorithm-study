package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1712{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        long a = Long.parseLong(arr[0]);
        long b = Long.parseLong(arr[1]);
        long c = Long.parseLong(arr[2]);

        long prod = a + b;
        long sales = c;
        int saleCnt = 0;

        if(b>=c) {
            System.out.println(-1);
            return;
        }

        while(true) {
            saleCnt++;
            if(sales > prod) {
                System.out.println(saleCnt);
                break;
            }
            prod = prod + b;
            sales = sales + c;
        }
    }
}