package types.leason.one;

class Motor{

}

class Car {
    //initialize types compatible number is 0
    //initialize boolean false
    //initialize reference null

    int ano;
    //only number positive other's types only negative and positives
    char primeiraLetra;
    //Unique is not numeric, value default false;
    boolean usado;
    Motor motor;
    String marca;
}

public class Teste {
    public static void main(String[] args) {
        boolean valor = true;
        int x = 15;
        double v = 10.2;
        v = 10.2d;
        v = 10.2D;
        long l = 13;
        l = 13l;
        l = 1_3L;
        float f = 13.1f;
        f = 13.1F;

        long x2 = 1_123_56_7891_23___4l;//long is last letter l, two sides underline required number, 1____6 is valid

        double d2 = 3.1e2; //e or E declaration cientific
        System.out.println(d2);

        float f2 = 2e3f;//e or E declaration cientific, float is last letter f
        System.out.println(f2);

        int i = 076112_3;//Octal (0-7)
        System.out.println(i);

        int h = 0xA12_3;//Hexadecimal (0-9[a-E]) x or X
        System.out.println(h);

        int b = 0b10_10;//Binary(0-1) b or B
        System.out.println(b);

        char a = 'A';
        System.out.println(a);
        a=65;
        System.out.println(a);
        a='\u03A9';
        System.out.println(a);


        int nãopode981981981 = 1651;
        boolean $$$dinheiro = false;
        boolean $valor = false;
        boolean _valor = false;
        boolean bonito_e_rico = false;

        int idade=1;
        int Idade=2;
        int IDATE=3;

        //int IDATE#123=3; Only $ and _  and chars unicode , not start number


        variavelMembro();
        variableLocal(args);
        //Variables arrays and members is initialized
        int[] valores = new int[10];
        System.out.println(valores[0]);
    }

    private static void variavelMembro() {
        Car car = new Car();
        System.out.println(car.ano);
        System.out.println(car.primeiraLetra == 0);
        System.out.println(car.usado);
        System.out.println(car.motor);
        System.out.println(car.marca);
    }

    private static void variableLocal(String[] args){
        int idade;
        if(args.length > 10){
            idade = 15;
        }else{
            idade = -15;
        }
        //Guaranteed initialize variable local
        System.out.println(idade);
    }


}


/**
 * Keywords invalid identifier variables
 *     abstract
 *     assert
 *     boolean
 *     break
 *     byte
 *     case
 *     catch
 *     char
 *     class
 *     const
 *     continue
 *     default
 *     do
 *     double
 *     else
 *     enum
 *     extends
 *     false
 *     final
 *     finally
 *     float
 *     for
 *     goto
 *     if
 *     implements
 *     import
 *     instanceof
 *     int
 *     interface
 *     long
 *     native
 *     new
 *     null
 *     package
 *     private
 *     protected
 *     public
 *     return
 *     short
 *     static
 *     strictfp
 *     super
 *     switch
 *     synchronized
 *     this
 *     throw
 *     throws
 *     transient
 *     true
 *     try
 *     void
 *     volatile
 *     while
 *     Literal => null, false e true
 */