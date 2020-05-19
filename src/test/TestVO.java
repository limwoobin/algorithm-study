package test;

public class TestVO {

    private String name;
    private String phone;
    private Long number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "TestVO{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", number=" + number +
                '}';
    }
}

