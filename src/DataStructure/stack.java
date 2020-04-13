package DataStructure;

import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("A");
		s.push("B");
		s.push("C");
		s.pop();
		s.peek();
		System.out.println(s);

	}
}
