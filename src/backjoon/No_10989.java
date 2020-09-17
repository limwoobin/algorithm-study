package backjoon;

import java.io.*;

public class No_10989 {
    public static void main(String[] args) throws IOException {
        int a[] = new int[10001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            a[Integer.parseInt(br.readLine())]++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<10001; i++) {
            while(a[i] != 0) {
                bw.write(Integer.toString(i) + "\n");
                a[i]--;
            }
        }
        br.close();
        bw.close();
    }
}
