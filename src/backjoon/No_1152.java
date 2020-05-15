package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] read = br.readLine().split(" ");

        int sum = 0;
        for(int i=0; i<read.length; i++) {
            if(!"".equals(read[i].trim())) {
                sum++;
            }
        }

        System.out.println(sum);
	}

}
