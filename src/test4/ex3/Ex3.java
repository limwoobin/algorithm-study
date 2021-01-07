package test4.ex3;


import java.util.HashSet;
import java.util.Set;

public class Ex3 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);
        list.addLast(3);

        list = removeDuplicate(list);
        System.out.println(list.toString());
    }

    private static LinkedList removeDuplicate(LinkedList list) {
        Set<Integer> set = listToSet(list);

        list.clear();
        for (Integer i : set) {
            list.addLast(i);
        }

        return list;
    }

    private static <T> Set<T> listToSet(LinkedList list) {
        LinkedList.ListIterator iterator = list.listIterator();
        Set<Integer> set = new HashSet<>();

        while (iterator.hasNext()) {
            set.add((Integer) iterator.next());
        }

        return (Set<T>) set;
    }
}


