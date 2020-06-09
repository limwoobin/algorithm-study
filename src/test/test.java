package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test {


	public static void main(String[] args) {
		LocalDateTime start = LocalDate.now().atStartOfDay();
		LocalDateTime end = start.plusDays(1);

		System.out.println(start);
		System.out.println(end);

		LocalDateTime st = LocalDate.now().atStartOfDay();
		System.out.println(st.plusDays(1));
	}
}