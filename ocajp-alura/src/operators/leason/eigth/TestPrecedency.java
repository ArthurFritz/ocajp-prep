package operators.leason.eigth;

public class TestPrecedency {
    public static void main(String[] args) {
        int a = 15 * 4 + 1;
        System.out.println(a);

        int b = 15 * (4 + 1);
        System.out.println(b);

        System.out.println(15 + 0 + " is one hundred fifty");
        System.out.println(15 + (0 + " is one hundred fifty"));

        System.out.println(("Arthur" +" Fritz").length());
    }
}

