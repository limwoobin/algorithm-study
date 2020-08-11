package test;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		String msg = test();
		System.out.println(msg);

	}

	static String test() {
		LocalTime currentTime = LocalTime.now();
		LocalTime targetTime = LocalTime.of(13,00,00);
		return currentTime.isAfter(targetTime) ? "AA" : "BB";
	}
}