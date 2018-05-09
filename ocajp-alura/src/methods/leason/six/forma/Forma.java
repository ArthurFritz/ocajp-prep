package methods.leason.six.forma;

public class Forma {
    protected double lado;
    private String cor = "azul";
    public double getArea(){
        return 0;
    }
     double getPerimetro(){
        return 10;
    }
    void imprimeCor(){
        System.out.println(cor);
    }
}

class Forma2{
    void metodo(){
        Forma f = new Forma();
        //f.cor = "azul" not visible is private;
    }
}
