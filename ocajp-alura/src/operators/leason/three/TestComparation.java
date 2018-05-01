package operators.leason.three;

public class TestComparation {
    public static void main(String[] args) {
        //System.out.println(true == "true");error
        //System.out.println(true == 1);error
        int age = 25;
        System.out.println(age == 25);

        System.out.println(1 == (100.0 / 100.0));

        System.out.println(true == true);
        System.out.println(true != false);

        System.out.println(1.0f == 1.0);
        System.out.println(1.0f == 1l);

        System.out.println(1 == 1.0);
        System.out.println(1 != 1);

        System.out.println(2 >= 1);//error =>
        System.out.println(2 <= 1);//error =<
        System.out.println(2 > 1);
        System.out.println(2 < 1);

    }
}



