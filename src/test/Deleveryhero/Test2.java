package test.Deleveryhero;

public class Test2 {
    public static void main(String[] args) {
        int n = 10;
        int k = 10;
        int result = test(10 , 10);
        System.out.println(result);

    }

    static int test(int n , int k) {
        if (k == 0) {
            return n-1;
        }

        int count = 1;
        while(true) {
            if (n == 2) {
                break;
            }

            if (n % 2 == 0 && k > 0) {
                k--;
                count++;
                n /= 2;
            } else {
                count++;
                n -= 1;
            }
        }

        return count;

    }
}
