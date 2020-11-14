package test.Deleveryhero;

public class Test {
    public static void main(String[] args) {
        int n = 1222222220;

        int size = String.valueOf(n).length();

        int result = 0;
        if (size > 1) {
            StringBuilder str = new StringBuilder("1");
            for (int i=0; i<size - 1; i++) {
                str.append("0");
            }
            result = Integer.parseInt(str.toString());
        }

        System.out.println(result);
    }
}
