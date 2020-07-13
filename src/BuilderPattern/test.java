package BuilderPattern;

public class test {
	public static void main(String[] args) {
		TestVO testVO = new TestVO.Builder()
									.name("TEST")
									.TCode(TCode.TC)
									.TNum(50)
									.build();

		System.out.println(testVO.getName());
		System.out.println(testVO.getTCode());
		System.out.println(testVO.getTNum());
	}
}