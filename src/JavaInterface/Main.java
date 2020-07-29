package JavaInterface;

public class Main implements Dog , Cat {
    public static void main (String[] args) {
        Main main = new Main();
        main.cry();
    }

    @Override
    public void cry() {
        System.out.println("zzzzz");
    }
}
