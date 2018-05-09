package methods.leason.six.forma.outra;

import methods.leason.six.forma.Forma;

class Triangulo extends Forma {

    public void imprime(){
        System.out.println("Lado = " + this.lado);
        //System.out.println("Lado = " + ((Forma)this).lado); protected
    }

    public void imprime2(){
        //System.out.println(this.getPerimetro); other package
    }
}
