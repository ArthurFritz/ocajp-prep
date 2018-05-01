package operators.leason.one;

import java.util.ArrayList;
import java.util.List;

public class TestOperators {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        List<String> lista2 = lista;

        int i = 15;
        long age = 15;
        long age2;
        age = 15;

        //byte -> short -> int -> long
        //float -> double
        //char only positive
        //char -> int -> long

        int a = 10;
        long b = 20;
        short c = 3;
        byte d = 4;
        char h = 65;

        //a = b;
        //c = a;
        //d = c;

        double e = 30.0;
        float f = 40.3f;
        double g = 40.3f;

        //d = g;

        f = a;
        f = b;
        f = c;
        f = d;
        g = a;
        g = b;
        g = c;
        g = d;
    }
}
