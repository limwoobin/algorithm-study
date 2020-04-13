package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		q.add("A");
		q.add("B");
		q.add("C");
		q.poll();
		System.out.println(q);
	}
}
