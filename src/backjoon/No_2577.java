package backjoon;

import java.util.Scanner;

public class No_2577 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int[] res =  new int[10];

        int result = a*b*c;
        String stResult = String.valueOf(result);
        for(int i=0; i<10; i++) {
            int count = 0;
            for(int j=0; j<stResult.length(); j++) {
                if(String.valueOf(stResult.charAt(j)).equals(String.valueOf(i))) {
                    count++;
                }
            }

         System.out.println(count);

        }
    }
}
