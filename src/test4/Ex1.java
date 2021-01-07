package test4;

public class Ex1 {
    public static void main(String[] args) {
        String a = "dfklsfabdkfslabsdgab";  // 텍스트
        String value = "ab";    // 특정 단어

        int strFirstIndex = getStrFirstIndex(a , value);
        int duplicateCount = getStrDuplicateCount(a , value);

        System.out.println(strFirstIndex);
        System.out.println(duplicateCount);
    }

    private static int getStrFirstIndex(String str , String value) {
        int index = 0;

        for (int i=0; i<str.length() - (value.length() - 1); i++) {
            String compareStr = str.substring(i , i + value.length());
            if (value.equals(compareStr)) {
                index = i;
                return index;
            }
        }

        return index;
    }

    private static int getStrDuplicateCount(String str , String value) {
        int count = 0;

        for (int i=0; i<str.length() - (value.length() - 1); i++) {
            String compareStr = str.substring(i , i + value.length());
            if (value.equals(compareStr)) {
                count++;
            }
        }

        return count;
    }
}
