package beyond.leason.one;

public class TestPrint {

    public String toString(){
        return "one object test print";
    }

    public static void main(String[] args) {
        System.out.print(1);
        System.out.print(2.0);
        System.out.print(" texto");
        System.out.print('a');
        System.out.println(new TestPrint());
        System.out.println(new int[10]);
        char[] letters = {'a', 'b'};
        System.out.println(letters);

        System.out.print("foo\n");
        System.out.println("bar");
        System.out.println("---------------------");

        System.out.format("%b %n", false);
        System.out.format("%d %n", 42);

        //System.out.format("%d %n", "a");IllegalFormatConversionException

        System.out.format("%f %n", 45.7);

        System.out.format("%s, o numero : %d esta correto? %b %n", "Sim", 2, true);

        System.out.format("Hello %s, have a nice day!%n", "Arthur");
        System.out.printf("Hello %s, have a nice day!%n", "Arthur");

        System.out.format("%s %s %n", "World", "Hello");
        System.out.format("%2$s %1$s %n", "World", "Hello");
        System.out.format("%2$s %2$s %n", "World", "Hello");

        System.out.format("[%5d]%n", 42);
        System.out.format("[%5s]%n", "foo");
        System.out.format("[%5s]%n", "foofoofoo");

        System.out.format("[%+5d]%n", 42);
        System.out.format("[%+5d]%n", -42);
        System.out.format("[%(5d]%n", -42);
        System.out.format("[%05d]%n", -42);//complete zero only numbers
        System.out.format("[%5d]%n", 50);
        System.out.format("[%,5.2f]%n", 50123123.12);//separation million

        System.out.format("[%0,8.2f]%n", 34.589);//separation million
        System.out.format("[%0,8.2f]%n", 34.585);

        System.out.format("[%5d]%n", 50);
        System.out.format("[%05d]%n", 50);//complete zero only numbers
        System.out.format("[%(+5d]%n", 50);
        System.out.format("[%-(+5d]%n", 50);//- change align text
        System.out.format("[%-8s]%n", "jose");//- change align text

        System.out.printf("%s%n",12);
        System.out.printf("%d%n",new Integer(321));
        System.out.printf("%d%n",(short)(byte)(double) 127);

    }
}

