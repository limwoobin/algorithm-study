import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1};

        for (int i=0; i<3; i++) {
            try {
                System.out.println(arr[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                continue;
            }
        }
    }
}
