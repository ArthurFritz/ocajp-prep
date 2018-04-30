package basic.leason.three;

public class HelloWorld {

    //javac HelloWorld.java
    //java basic.leadon.three.HelloWorld
    //java -Dpropriedade=Valor HelloWorld

    //change classpath use folder location, separate unix (:) and windows (;)
    //java -cp folder basic.leadon.three.HelloWorld
    //java -classpath folder basic.leadon.three.HelloWorld
    public static void main (String[] args){ //String... args, String args[]
        System.out.println("Rodando o programa");
        System.out.println(args.length);
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    //Versão do java ao compilar
    //javac MinhaClasse.java -source 1.3

    //Parâmetro como varargs
    //public static void main (String... args) {}

    //A ordem dos modificadores não importa
    //static public void main(String[] args) {}

    //O nome do parâmetro não importa
    //public static void main (String... argumentos){}

    //Também é uma definição válida de array
    //public static void main (String args[]) {}
}
