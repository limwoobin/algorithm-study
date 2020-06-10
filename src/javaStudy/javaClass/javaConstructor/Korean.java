package javaStudy.javaClass.javaConstructor;

public class Korean {
    String nation = "대한민국";
    String name;
    String ssn;

    public Korean(String n , String s) {
        System.out.println("this--->" + this.name);
        System.out.println("param--->" + n);
        name = n;
        ssn = s;
    }
}
