package javaStudy.sec12.exam02;

import java.util.HashMap;

public class KeyExample {
    public static void main(String[] args) {
        HashMap<Key , String> hashMap = new HashMap<Key , String>();

        hashMap.put(new Key(1) , "홍길동");
        System.out.println(new Key(1));

        String value = hashMap.get(new Key(1));
        System.out.println(value);
        System.out.println(new Key(1));
    }
}
