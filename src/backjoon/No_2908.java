package backjoon;

import java.util.Scanner;

public class No_2908 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();

        String tempA = "";
        String tempB = "";

        for(int i=a.length()-1; i>=0; i--) {
            tempA = tempA.concat(String.valueOf(a.charAt(i)));
        }

        for(int i=b.length()-1; i>=0; i--) {
            tempB = tempB.concat(String.valueOf(b.charAt(i)));
        }

        int suA = Integer.parseInt(tempA);
        int suB = Integer.parseInt(tempB);

        if(suA > suB) {
            System.out.println(suA);
        }else {
            System.out.println(suB);
        }
    }
}
