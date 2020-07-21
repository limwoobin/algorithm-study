package JavaGeneric;

public class GenericStudy {
    public static void main(String[] args) {
        GenericTest<String> genericTest = new GenericTest<>("TEST");
        System.out.println(genericTest.getData());

        GenericTest<Integer> genericTest2 = new GenericTest<>(88);
        System.out.println(genericTest2.getData());
    }
}


class GenericTest<T> {
    private T result;
    GenericTest(T result) {
        this.result = result;
    }

    public T getData() {
        return this.result;
    }
}