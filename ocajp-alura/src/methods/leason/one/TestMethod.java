package methods.leason.one;

class Param{
    String getNumberOne(int a){
        if(a > 0) return "maior";
        else if(a < 0) return "menor";
        return "zero";
    }
    String getNumberTwo(int a){
        if(true) return "verdadeiro";
        return "nunca cai aqui";
    }
    String getNumberException(int a){
        if(true) return "verdadeiro";
        throw new RuntimeException("Exception");
    }
    void primitive(long a){
        System.out.println(a);
    }
    void reference(Object o){
        System.out.println(o);
    }
    void test(int a , int b){
        System.out.println(a + b);
    }
}

class ClassMethods{
    int getNumero() throws RuntimeException {
        return 5;
    }
}

class TestMethod {
    public static void main(String[] args) {
        Param p = new Param();
        int a=1;
        p.getNumberException(1);
        System.out.println(p.getNumberException(1));
        String result = p.getNumberException(1);
        p.primitive(a);//Automatic promotion
        p.primitive('Z');//Automatic promotion
        p.reference(new Object());
        p.reference("arthur");
        p.test(1,2);
    }
}


/**
 E, ainda na assinatura, podemos ter:

 final - em caso de herança, o método não pode ser sobrescrito nas classes filhas;
 abstract - obriga as classes filhas a implementarem o método. O método abstrato não pode ter corpo definido;
 static - atributos acessados direto na classe, sem instâncias;
 synchronized - lock da instância;
 native - não cai nesta prova. Permite a implementação do método em código nativo (JNI);
 strictfp - não cai nesta prova. Ativa o modo de portabilidade matemática para contas de ponto flutuante.
 throws <EXCEPTIONS> - após a lista de parâmetros, podemos indicar quantas exceptions quisermos para o throws.

 A ordem dos elementos na assinatura dos métodos é sempre a seguinte, sendo que os modificadores podem aparecer em qualquer ordem: <MODIFICADORES> <TIPO_RETORNO> <NOME> (<PARÂMETROS>) <THROWS_EXCEPTIONS>
 **/