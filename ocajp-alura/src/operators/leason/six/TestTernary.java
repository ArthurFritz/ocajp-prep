package operators.leason.six;

public class TestTernary {
    public static void main(String[] args) {
        //(condition) ? true : false
        int i = 5;
        int result = (i == 5) ? 100 : 0;
        System.out.println(result);
        //int resultado2 = i == 5 ? "100" : 0; incompatible type
        System.out.println(i == 5 ? "100" : 0);

    }
}
