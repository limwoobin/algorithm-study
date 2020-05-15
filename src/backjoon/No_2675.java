package backjoon;

import java.util.Scanner;

public class No_2675 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        for(int w=0; w<cnt; w++) {
            String res = "";
            int su = in.nextInt();
            String line = in.next();
            for(int i=0; i<line.length(); i++) {
                for(int j=0; j<su; j++) {
                    res = res + line.charAt(i);
                }
            }
            System.out.println(res);
        }
    }
}
