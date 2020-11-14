package test.Deleveryhero;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.TimeZone;
import java.util.regex.Pattern;

public class Test3 implements Comparable<Test3> {

    Test3() {

    }
    public static void main(String[] args) {

        String pattern = "\\d+(\\.\\d+){0,2}(-SNAPSHOT)$?";
        System.out.println(Pattern.matches(pattern , "3.8.0-SNAPSHOT"));
        System.out.println(Pattern.matches(pattern , "3.8.0-SnapSHOT"));
        System.out.println(Pattern.matches(pattern , "0.1.0"));
       test("A");
       test("");


       String pattern2 = "^.*.-SNAPSHOT$?";
        System.out.println(Pattern.matches(pattern2 , "3.8.0-SNAPSHOT"));
        System.out.println(Pattern.matches(pattern2 , "3.8.0-SnapSHOT"));
        System.out.println(Pattern.matches(pattern2 , "3.8.0"));
    }

    public static void test(String params) {
        System.out.println(params);
    }

    @Override
    public int compareTo(Test3 o) {
        if (o == null) {

        }
        return 0;
    }
}
