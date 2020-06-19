package javaStudy.sec14.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        map.put("AA" , 80);
        map.put("BB" , 85);
        map.put("CC" , 90);
        map.put("DD" , 95);

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String element = keyIterator.next();
            Integer value = map.get(element);
            System.out.println(element + ":" + value);
        }
        System.out.println();

        Set<Map.Entry<String , Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String , Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String , Integer> entry = entryIterator.next();
            String element = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(element + ":" + value);
        }
    }
}
