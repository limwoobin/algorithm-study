package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class test {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("C");
		System.out.println(set.size());
		for(String a : set) {
			System.out.println(a);
		}


		Map<Long , Object> map = new HashMap<>();
		map.put(1l , "A");
		map.put(2l , "B");
		map.put(3l , "C");


		for(long id : map.keySet()) {
			System.out.println(id);
			System.out.println(map.get(id));
		}

		System.out.println(map.size());
	}
}