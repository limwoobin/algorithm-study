package DataStructure;

import java.util.LinkedList;

public class listTest {
    public static void main(String[] args){
        LinkedList<Integer> list[] = new LinkedList[5];
        list[0] = new LinkedList<>();
        list[0].add(1);
        list[0].add(2);
        System.out.println(list[0]);
        System.out.println(list);
    }
}
