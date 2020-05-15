package test;

import java.io.IOException;

public class test {
	public static void main(String[] args) throws IOException {
		test t = new test();
		System.out.println(t.isBool());
	}

	public boolean isBool(){
		String str = "";

		return (str == null || "".equals(str));
	}
}