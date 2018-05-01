package types.leason.seven;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TestsStrings {
    public static void main(String... args){

        String texto = "Pretendo fazer a prova de certificação de Java";
        System.out.println(texto.indexOf("Pretendo"));
        System.out.println(texto.indexOf("e"));
        System.out.println(texto.indexOf("Pretendia"));
        System.out.println(texto.indexOf("tendo"));
        System.out.println(texto.indexOf("a"));
        System.out.println(texto.lastIndexOf("a"));
        System.out.println(texto.lastIndexOf("Pretendia"));
        System.out.println(texto.indexOf("Pretendo",7));
        System.out.println(texto.lastIndexOf("a",44));
        System.out.println(texto.startsWith("Pretendia"));
        System.out.println(texto.startsWith("Pretendo"));
        System.out.println(texto.endsWith("Java"));
        System.out.println(texto.endsWith("C#"));

        System.out.println("Java".equals("java"));
        System.out.println("Java".equalsIgnoreCase("java"));

        System.out.println("Certificado".compareTo("Arnaldo"));
        System.out.println("Certificado".compareTo("Certificado"));
        System.out.println("Certificado".compareTo("Grécia"));
        System.out.println("Certificado".compareTo("certificado"));
        System.out.println("Certificado".compareToIgnoreCase("certificado"));

        String java = "Java";
        System.out.println(java.substring(1));
        //System.out.println(java.substring(-1));
        System.out.println(java.substring(0,4));
        System.out.println(java.substring(1,4));
        System.out.println(java.substring(0,3));

        String parseado = "    Quero tirar um certificado oficial java!   ".toUpperCase().trim();
        System.out.println(parseado);

        //String immutable
        String s = "caelum";
        s = s.toUpperCase();//Alter reference
        System.out.println(s);

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(3));
        System.out.println("".isEmpty());
        System.out.println("Arthur".isEmpty());
        System.out.println(" ".isEmpty());

        System.out.println("             joao          ".trim());
        System.out.println(s.replace('A','E'));
        System.out.println(s.replace("CAE","ALU"));

        String nameDirect = "Java";
        String nameIndirect = new String("Java");
        char[] name = new char[] {'J', 'a','v','a'};
        String name1 = new String(name);

        StringBuilder sb1 = new StringBuilder("Java");
        String name2 = new String(sb1);

        String nameNull = null;

        String nameTest = "Certification" + " " + "Java";

        String nameTestNull = nameTest + " " + nameNull;

        System.out.println(nameTest);
        System.out.println(nameTestNull);
        //System.out.println(nameNull.toString()); NPE

        System.out.println("Certification " + 1500);
        System.out.println(1500 + " Certification ");//1500 Certification
        System.out.println(15+00 + " Certification ");//15 Certification
        System.out.println(1+500 + " Certification ");//501 Certification
    }
}
