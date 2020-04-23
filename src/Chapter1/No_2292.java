package Chapter1;

import java.io.IOException;
import java.util.Scanner;

public class No_2292{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int data = in.nextInt();

        int val1 = 1;
        int val2 = 1;
        int cnt = 1;
        while(true) {
            if((data>=val1) && val2 >= data) {
                  System.out.println(cnt);
                  break;
              }
              val1 = val2;
              val2 = val2 + (cnt*6);
              cnt++;
        }
    }
}
