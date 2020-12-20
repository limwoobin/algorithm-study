package test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class Test3 {
    private static int[][] maps = {
                                {1, 28, 41, 22, 25, 79, 4},
                                {39, 20, 10, 17, 19, 18, 8},
                                {21, 4, 13, 12, 9, 29, 19},
                                {58, 1, 20, 5, 8, 16, 9},
                                {5, 6, 15, 2, 39, 8, 29},
                                {39, 7, 17, 5, 4, 49, 5},
                                {74, 46, 8, 11, 25, 2, 11}
                            };

    private static int p = 19;
    private static int r = 6;

    public static void main(String[] args) {
        int[][] range = new int[][]{};

        int row = 5;
        int column = 4;

        List<List<Integer>> rowRange = new ArrayList<>();


        for (int i = -(r/2 + 1); i < r/2; i++) {
            List<Integer> rowList = null;

            try {
                int[] rowArray = maps[row + i];
                rowList = new ArrayList<>(Arrays.stream(rowArray).boxed().collect(Collectors.toList()));
            } catch (ArrayIndexOutOfBoundsException e) {
                continue;
            }

            List<Integer> columnList = new ArrayList<>();
            for (int j=0; j<=rowRange.size(); j++) {
                try {
                    columnList.add(rowList.get(column - (j + 2)));
                } catch (IndexOutOfBoundsException e) {
                    continue;
                }
            }

            for (int j=0; j<rowRange.size(); j++) {
                try {
                    columnList.add(rowList.get(column + j));
                } catch (IndexOutOfBoundsException e) {
                    continue;
                }
            }

            rowRange.add(columnList);
        }

        for (int i=0; i<rowRange.size(); i++) {
            System.out.println(rowRange.get(i).toString());
        }
    }
}
