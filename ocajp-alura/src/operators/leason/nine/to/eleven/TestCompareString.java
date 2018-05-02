package operators.leason.nine.to.eleven;

public class TestCompareString {
    public static void main(String[] args) {
        String name1 = new String("Arthur");
        String name2 = new String("Arthur");

        System.out.println(name1 == name2);

        String name3 = "Arthur";
        String name4 = "Arthur";
        System.out.println(name3 == name4);

        System.out.println(name2 == name4);

        System.out.println(name2.equals(name4));
    }
}
