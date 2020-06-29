package backjoon;

public class No_4673 {
    public static void main(String[] args) {
        boolean[] is = new boolean[15000];

        for(int i=1; i<=10000; i++) {
            int sum = 0;
            int su = i;
            while(su!=0){
                sum += su%10;
                su /= 10;
            }
            int cra = i + sum;
            is[cra] = true;
        }

        for(int j=1; j<=10000; j++) {
            if(!is[j]) {
                System.out.println(j);
            }
        }
    }
}
