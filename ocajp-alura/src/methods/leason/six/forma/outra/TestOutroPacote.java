package methods.leason.six.forma.outra;

import methods.leason.six.forma.*;
//import methods.leason.six.forma.Quadrado; default not visible other package

public class TestOutroPacote {
    public static void main(String args[]){

        //Quadrado quadrado = new Quadrado(); - default not visible other package

        Forma f = new Forma();
        //f.lado = 5.5; Protected

        Triangulo t = new Triangulo();
        t.imprime();
    }
}
