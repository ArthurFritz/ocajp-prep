package loops.leason.two;

import java.util.ArrayList;

public class TestFor {
    public static void main (String... args){
        //int i = 1;
        //while (i< 10){
        //    System.out.println(i);
        //    i++;
        //}
        System.out.println("---------------------------------");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("---------------------------------");
        for (int i = 1; i < 10; i++){
            System.out.println(i);
        }
        System.out.println("---------------------------------");
        for (int i = 1; i > 10; i++){
            System.out.println(i);
        }
        System.out.println("---------------------------------");
        // infinite loop
        //int j = 1;
        //for (int i = 1; j <= 10; i++){
        //    System.out.println(i);
        //}
        // optional infinite loop
        //for (int i = 1; i > 10; ){
        //      System.out.println(i);
        //}
        //
        // optional infinite loop
        //for (int i = 1; ; ){
        //      System.out.println(i);
        //}
        //
        // optional infinite loop
        //for (; ; ){
        //      System.out.println("mensagem");
        //}
        //
        // optional infinite loop
        //for (; ; ){
        //      System.out.println("mensagem");
        //}
        // int j = 3;
        //not compile because code not execute

        //many variables same types
        for (int i = 0, j = 10; i < 10; i++){
            System.out.println(i + " - " + j);
        }
        System.out.println("---------------------------------");

        for (int i = 0, j = 10; i < 10; i++, j--){
            System.out.println(i + " - " + j);
        }
        System.out.println("---------------------------------");
        int x,y;
        for (x = 0, y = 10; x < 10; x++, y--){
            System.out.println(x + " - " + y);
        }
        System.out.println("---------------------------------");
        int f;
        long g;
        for (f = 0, g = 10; f < 10; f++, g--){
            System.out.println(f + " - " + g);
        }
        System.out.println("---------------------------------");

        for (f = 0, g = 10; f < 10; f++, g--, System.out.println("oi")){
            System.out.println(f + " - " + g);
        }
        System.out.println("---------------------------------");

        for (f = 0, g = 10; f < 10; System.out.println(f + " - " + g), f++, g--){
            System.out.println(f + " - " + g);
        }
        System.out.println("---------------------------------");

        for (f = 0, g = 10; f < 10; System.out.println(f + " - " + g), f++, g--);
            System.out.println("Mensagem");
        System.out.println("---------------------------------");


        int[] numbers = {1,2,3,4,5,6};
        for (int i = 0; i<numbers.length; i++){
            int number = numbers[i];
            System.out.println(number);
        }
        System.out.println("------------- ENHANCED ----------");
        for (int number: numbers) {
            System.out.println(number);
        }
        System.out.println("---------------------------------");


        ArrayList<String> names = new ArrayList<>();
        names.add("Arthur");
        names.add("Stephanie");
        for(String name : names){
            System.out.println(name);
            name = null;// do not effect
        }
        System.out.println(names);

        for(String name : names){
            System.out.println(name);
            names.remove(name);// avoid remove elements in foreach because comportamment not is specific
        }
        System.out.println(names);


    }
}


