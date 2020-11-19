package backjoon;

import java.io.IOException;
import java.util.Scanner;

public class No_14681 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int result = 0;
        if(a>0 && b>0) {
            result = 1;
        }else if(a>0 && b<0) {
            result = 4;
        }else if(a<0 && b>0) {
            result = 2;
        }else if(a<0 && b<0) {
            result = 3;
        }

        System.out.println(result);
    }
}
