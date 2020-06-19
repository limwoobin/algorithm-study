package javaStudy.sec14.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("AA");
        set.add("BB");
        set.add("CC");
        set.add("DD");

        int size = set.size();
        System.out.println("size:" + size);

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("AA");
        set.remove("BB");

        System.out.println("size:" + set.size());

        iterator = set.iterator();
        for (String element : set) {
            System.out.println("\t" + element);
        }

        set.clear();
        if(set.isEmpty()) {
            System.out.println("비어 있음");
        }
    }
}
