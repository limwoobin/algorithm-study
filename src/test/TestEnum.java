package test;

public enum TestEnum {
    LOCAL("로컬"),
    DEVELOP("개발"),
    PRODUCT("운영");

    private String value;

    TestEnum(String value) {
        this.value = value;
    }

    public String getKey() {
        return name();
    }

    public String getValue() {
        return value;
    }
}
