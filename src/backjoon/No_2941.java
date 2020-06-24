package backjoon;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class No_2941 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String temp = in.next();

        String[] arr = new String[8];
        arr[0] = "c=";
        arr[1] = "c-";
        arr[2] = "dz=";
        arr[3] = "d-";
        arr[4] = "lj";
        arr[5] = "nj";
        arr[6] = "s=";
        arr[7] = "z=";

        int cnt = 0;

        for(int i=0; i<8; i++) {
            Pattern pattern = Pattern.compile(arr[i]);
            Matcher matcher = pattern.matcher(temp);
            while(matcher.find()) {
                cnt++;
            }
        }
        System.out.println(temp.length() - cnt);
    }
}
