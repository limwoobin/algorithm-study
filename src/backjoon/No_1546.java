package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int fr = Integer.parseInt(br.readLine());
        String[] arr = new String[fr];
        double[] arr2 = new double[fr];
        double max = arr2[0];


        arr = br.readLine().split(" ");
        for(int i=0; i<arr.length; i++) {
            arr2[i] = Double.valueOf(arr[i]);
            if(max < arr2[i]) {
                max = arr2[i];
            }
        }

        double temp2 = 0;
        for(int j=0; j<arr2.length; j++) {
            temp2 = temp2 + ((arr2[j]/max) * (double)100);
        }
        System.out.println(temp2 / fr);
	}

}
