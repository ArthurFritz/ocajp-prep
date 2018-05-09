package methods.leason.five;

class Livro{
    Livro(){
        //this(123) not compiled, recursive
        System.out.println("Sem argumentos");
    }
    Livro(int i){
        this(valor());//first line in the constructor, only one
        //new Livro(123) - Loop infinite
        System.out.println("contrutor com int");
    }
    Livro(String... s){
        System.out.println("String");
    }

    static String valor(){return "xpto";}
}

public class TestConstructor2 {
    public static void main(String... args){
        Livro a = new Livro("arthur","stephanie","fritz");
        a = new Livro();
        a = new Livro(1);
    }
}
