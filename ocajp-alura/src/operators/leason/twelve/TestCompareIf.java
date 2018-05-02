package operators.leason.twelve;

public class TestCompareIf {
    public static void main(String[] args) {
        boolean autentic = true;
        if (autentic){
            System.out.println("Ok");
        }else{
            System.out.println("Not ok");
        }

        if (1 < 2){
            System.out.println("Ok");
        }

        boolean value = true;
        if (value == false){
            System.out.println("false");
        }

        if(value){
            System.out.println("valor");
        }

        int a = 0, b =3;
        // not compile
        //if (a = b){
        //    System.out.println("iguais");
        //}

        if(value = false){
            System.out.println("False");
        }

        if(value = true){
            System.out.println("Valid");
        }

        boolean v = true;
        if(v)
            System.out.println("true");
        else
            System.out.println("false");

        if(v)
            System.out.println("true");

        if(v)
            System.out.println("true");
        else if (value)
            System.out.println("false - true");
        else
            System.out.println("false - false");

        if(v)
            System.out.println("true");
        else if (value)
            System.out.println("false - true");

        if(autentic){
            System.out.println("autentico");
        }else
            System.out.println("falhou");
            System.out.println("Tente novamente");

        int valor = 100;
        if (valor > 200)
        if (valor < 400)
        if (valor > 300)
            System.out.println("a");
        else
            System.out.println("b");
        else
            System.out.println("c");

    }
}

