package types.leason.six;

import types.leason.three.Car;

public class TestStringBufferAndBuilder {
    public static void main(String[] args) {
        //Its same, in the certification,
        //but difference is StringBuilder is created before version 1.5 aprimorate use in threads
        StringBuffer();
        StringBuilder();
    }

    private static void StringBuilder() {
        StringBuilder sb1 = new StringBuilder("Caelum");
        sb1.append(" - ");
        sb1.append("Ensino e inovação");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder(50);
        System.out.println(sb2.toString());

        StringBuilder sb3 = new StringBuilder(sb1);
        sb3.append(" e Alura e Casa do Código");
        sb3.append('x');
        sb3.append(sb1);
        sb3.append(new Car());
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("Caelum - Inovação");
        sb4.insert(9,"Ensino e ");
        System.out.println(sb4);
        sb4.delete(6,15);
        System.out.println(sb4);
        sb4.reverse();

        System.out.println(new StringBuffer("Arthur").reverse());

        StringBuilder sb5 = new StringBuilder("Caelum - Ensino e inovação");
        System.out.println(sb5.substring(6,15));
        System.out.println(sb5.subSequence(6,15));
        System.out.println(sb5);//not altered
    }

    private static void StringBuffer() {
        StringBuffer sb1 = new StringBuffer("Caelum");
        sb1.append(" - ");
        sb1.append("Ensino e inovação");
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer(50);
        System.out.println(sb2.toString());

        StringBuffer sb3 = new StringBuffer(sb1);
        sb3.append(" e Alura e Casa do Código");
        System.out.println(sb3);
    }
}
