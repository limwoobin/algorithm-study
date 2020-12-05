package backjoon;

import java.io.*;

public class No_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for(int i=0; i<count; i++) {
            String[] temp = br.readLine().split(" ");
            bw.write(Integer.parseInt(temp[0])+Integer.parseInt(temp[1]) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
