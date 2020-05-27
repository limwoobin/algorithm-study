package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test {
	public static void main(String[] args) {
		TestVO tvo = new TestVO();
		tvo.setName("드록바");
		tvo.setPhone("samsung");
		tvo.setNumber(32431L);
		TestVO tvo2 = new TestVO();
		tvo2.setName("BBB");
		tvo2.setPhone("apple");
		tvo2.setNumber((long) 22534);
		TestVO tvo3 = new TestVO();
		tvo3.setName("CCC");
		tvo3.setPhone("samsung");
		tvo3.setNumber((long) 100);


		List<TestVO> tlist = new ArrayList<>();
		tlist.add(tvo);
		tlist.add(tvo2);
		tlist.add(tvo3);

		Map<Long, List<TestVO>> screeningPartnerMap = tlist.stream().collect(Collectors.groupingBy(TestVO::getNumber));
//		System.out.println(screeningPartnerMap.toString());

		for(Long key : screeningPartnerMap.keySet()) {
			System.out.println(key);
			System.out.println(screeningPartnerMap.get(key));
		}

	}
}