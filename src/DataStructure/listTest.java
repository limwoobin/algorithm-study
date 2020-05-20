package DataStructure;

import java.util.*;

public class listTest {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("AA");
        set.add("BB");
        set.add("CC");
        set.add("DD");

        System.out.println(set);
        System.out.println(set.size());

       for(String a : set){
           System.out.println(a);
       }
    }
}
