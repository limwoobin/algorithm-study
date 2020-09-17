package test;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String table[] = new String[4];
        table[0] = "XOXO";
        table[1] = "OXXO";
        table[2] = "XXOX";
        table[3] = "OOOO";

        boolean values[] = new boolean[table[0].length()];

        List<String> list = Arrays.asList(table);
        Map<String , Integer> map = new HashMap<>();

        for (int i=0; i<list.size(); i++) {
            int count = 0;
            for (int j=0; j<list.get(i).length(); j++) {
                if ("O".equals(String.valueOf(list.get(i).charAt(j)))) {
                    count++;
                }
            }
            map.put(list.get(i) , count);
        }

        List<String> keySetList = new ArrayList<>(map.keySet());
        Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

        int num = 0;
        for(String key : keySetList) {
            if (!isVal(values)) {
                for (int i=0; i<key.length(); i++) {
                    if ("O".equals(String.valueOf(key.charAt(i)))) {
                        values[i] = true;
                    }
                }
                num++;
            }
        }

        System.out.println(num);
    }

    static boolean isVal(boolean[] values) {
        for (boolean isValue : values) {
            if (!isValue) {
                return false;
            }
        }
        return true;
    }
}
