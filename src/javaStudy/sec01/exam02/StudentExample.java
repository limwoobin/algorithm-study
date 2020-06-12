package javaStudy.sec01.exam02;

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("홍길동" , "1231231" , 1);
        System.out.println(student.name);
        System.out.println(student.ssn);
        System.out.println(student.studentNo);
    }
}
