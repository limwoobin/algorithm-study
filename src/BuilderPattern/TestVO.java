package BuilderPattern;

public class TestVO {

    private String name;

    private TCode tCode;

    private int tNum;

    public String getName() {
        return this.name;
    }

    public TCode getTCode() {
        return this.tCode;
    }

    public int getTNum() {
        return this.tNum;
    }

    public TestVO(String name , TCode tCode , int tNum) {
        this.name = name;
        this.tCode = tCode;
        this.tNum = tNum;
    }

    static class Builder {
        private String name;
        private TCode tCode;
        private int tNum;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withTCode(TCode tCode) {
            this.tCode = tCode;
            return this;
        }

        public Builder withTNum(int tNum) {
            this.tNum = tNum;
            return this;
        }

        public TestVO build() {
            return new TestVO(name , tCode , tNum);
        }
    }
}

