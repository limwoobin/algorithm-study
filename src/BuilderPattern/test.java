package BuilderPattern;

public class test {
	public static void main(String[] args) {
		GenericTest<Integer> asd = new GenericTest<Integer>(56);
		System.out.println(asd.getData());
	}
}


class GenericTest<T> {
	private String asd;
	private T result;
	GenericTest(T result) {
		this.result = result;
	}

	public T getData() {
		return this.result;
	}
}