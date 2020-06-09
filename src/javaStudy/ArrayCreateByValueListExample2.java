package javaStudy;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {

        int[] scores;
        scores = new int[] {80, 85, 90};

        int sum1 = 0;
        for (int i=0; i<3; i++) {
            sum1 += scores[i];
        }

        System.out.println("총합:" + sum1);

        int sum2 = add(new int[]{80 , 85 , 90});
        System.out.println(sum2);
    }

    public static int add(int[] scores) {
        int sum = 0;
        for (int i=0; i<3; i++) {
            sum += scores[i];
        }
        return sum;
    }
}
