package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class No_1181 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		List<String> n = new ArrayList<String>(10000001);
		for(int i=0; i<T; i++) {
			String temp = br.readLine();
			if(!n.contains(temp))
				n.add(temp);
		}

		Comparator<String> myComparator = new Comparator<String>() {

			@Override
			public int compare(String x, String y) {
				if(x.length() > y.length()) {
					return 1;
				}else if(x.length() == y.length()) {
					return x.compareTo(y);
				}
				return -1;
			}
		};
		Collections.sort(n , myComparator);
		for(int i=0; i<n.size(); i++) {
			System.out.println(n.get(i));
		}
	}
}
