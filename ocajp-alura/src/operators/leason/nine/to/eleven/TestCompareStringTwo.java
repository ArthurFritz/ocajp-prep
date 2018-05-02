package operators.leason.nine.to.eleven;

public class TestCompareStringTwo {
    public static void main(String[] args) {
        String ab = "a"+"b";
        System.out.println(ab=="ab");

        String a2 = "a";
        String ab2 = a2+"b";
        System.out.println(ab2=="ab");


        String text = "um texto qualquer";
        String txt = text.substring(3,8);
        System.out.println(txt == "texto");

        System.out.println(text.toLowerCase() == text);
        System.out.println(text.toString() == text);
    }
}
