package operators.leason.nine.to.eleven;

public class CountString {
    public static void main(String[] args) {
        String h = new String("hello"); // 2 "literral"
        String h1 = "hello ";// 0 ref poll
        String w = "world"; // 1 poll

        System.out.println("hello "); //0 poll
        System.out.println(h1 + "world"); // 1

        System.out.println("Hello " == h1);// 1 poll
    }
}

