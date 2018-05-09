package methods.leason.six.forma;

public class TestPacote {
    public static void main(String args[]){
        Forma f = new Forma();
        f.lado = 5.5;
        f.getPerimetro();
        f.imprimeCor();


        Quadrado q = new Quadrado();
        q.lado = 5.5;
        q.getPerimetro();
        q.imprimeCor();
    }
}
