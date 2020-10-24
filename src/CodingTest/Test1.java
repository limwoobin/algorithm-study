package CodingTest;

public class Test1 {
    private static int arr[][] = {{1,3},{3,1},{3,5},{2,5},{5,3}};

    public static void main(String[] args) {
        int cnt = 0;
        int index = 0;

        for (int array[] : arr) {
            int num = array[0];
            int num2 = array[1];
            for (int j=index; j<arr.length-1; j++) {
                int val = arr[j+1][0];
                int val2 = arr[j+1][1];

                if (num == val2 && num2 == val) {
                    cnt++;
                    break;
                }

            }
            index++;
        }

        System.out.println(cnt);
    }
}
