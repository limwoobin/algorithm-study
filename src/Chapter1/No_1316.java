package Chapter1;

import java.util.Scanner;

public class No_1316 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        int result = cnt;
        int minus = 0;
        for(int i=0; i<cnt; i++) {
            String temp = in.next();
            boolean[] check = new boolean[26];
            for(int j=1; j<temp.length(); j++) {
                if(temp.charAt(j-1) != temp.charAt(j)) {
                    if(check[temp.charAt(j) - 97] == true) {
                        result--;
                        break;
                    }
                    check[temp.charAt(j-1) - 97] = true;
                }
            }
        }

        System.out.println(result);
	}

}
