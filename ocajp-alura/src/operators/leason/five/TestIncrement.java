package operators.leason.five;

public class TestIncrement {
    public static void main(String[] args) {

        int a = 10;
        a += ++a + a + ++a;
        // a = a ++a + a + ++a;
        // a = 10 ++a + a + ++a;
        // a = 10 + 11 + a + ++a;
        // a = 10 + 11 + 11 + ++a;
        // a = 10 + 11 + 11 + 12;
        System.out.println(a);

        int i = 5;
        System.out.println(i--);//after decrement
        System.out.println(i);
        System.out.println(i++);//after increment
        System.out.println(i);
        System.out.println(--i);//before decrement
        System.out.println(++i);//before increment

        i += 2;
        System.out.println(i);

        i -= 2;
        System.out.println(i);

        i *= 2;
        System.out.println(i);

        i *= 5;
        System.out.println(i);

        i /= 10;
        System.out.println(i);

        i *= 100;
        System.out.println(i);

        i %= 3;
        System.out.println(i);
        System.out.println(i+=3);

        byte b = 10;
        b += 200; //shortcut
        //b = b + 3; Not compiled
        System.out.println(b);
    }
}
