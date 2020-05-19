package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		TestVO testVO = new TestVO();

		testVO.setName("AA");
		testVO.setNumber((long) 15351546);
		testVO.setPhone("01012341234");

		System.out.println(testVO.toString());
	}
}