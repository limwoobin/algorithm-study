package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        String[] line2 = br.readLine().split(" ");
        List<String> list = new ArrayList<String>();



        for(int i=0; i<Integer.parseInt(line[0]); i++) {
            if(Integer.parseInt(line[1]) > Integer.parseInt(line2[i])) {
                list.add(line2[i]);
            }
        }

        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
