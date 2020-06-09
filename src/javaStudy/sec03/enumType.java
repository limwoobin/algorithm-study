package javaStudy.sec03;

public class enumType {
    public static void main(String[] args) {
        Week today = Week.FRIDAY;
        System.out.println(today);
        System.out.println(Week.FRIDAY);

        Week today2 = Week.FRIDAY;
        System.out.println(today2);
        System.out.println(Week.FRIDAY);

        System.out.println(today == Week.FRIDAY);

        System.out.println(today == today2);
    }
}
