package javaStudy;

import java.util.ArrayList;
import java.util.List;

public class forStudy {
    public static void main(String[] args) {

        Outer : for(int i=0; i<5; i++) {
            Inner :for(int j=0; j<5; j++) {
                System.out.println(i + "," + j);
                if(j == 2) {
                    break Outer;
                }
            }
        }

        List<String> list1 =  new ArrayList<String>();
        list1.add("A");

        List<String> list2 =  new ArrayList<String>();
        list2.add("A");

        if (list1 == list2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
