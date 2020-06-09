package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test {


	public static void main(String[] args) {
		int[][] array = {
				{1,2},
				{3,4,5},
				{6,7,8,9,11}
		};

		System.out.println(array[2].length);

		System.out.println(array[0][0]);
		System.out.println(array[0][1]);
		System.out.println(array[1][0]);
		System.out.println(array[1][1]);
		System.out.println(array[1][2]);
	}
}