package methods.leason.eigth;

class Prova{
    int tempo;
}

public class TestReferencePrimitive {
    public static void main(String args[]){
        Prova prova = new Prova();
        prova.tempo = 100;
        teste(prova);
        System.out.println(prova.tempo);

        teste2(prova);
        System.out.println(prova.tempo);

        int i = 2;
        teste(i);
        System.out.println(i);// print 2
        i = teste2(i);
        System.out.println(i);// print 5
    }

    static void teste(Prova prova){
        prova.tempo = 210;
    }

    static void teste2(Prova prova){
        prova = new Prova();
        prova.tempo = 520;
    }

    static void teste(int i) {
        i = 5;
        System.out.println(i);// print 5
    }

    static int teste2(int i){
        i = 5;
        System.out.println(i);// print 5
        return i;
    }
}
