package relationship.leason.three;

import java.util.*;

class Conta{
    int id;
    void liga(){};
}

class ContaJuridica extends Conta{
    String cnpj;
    void fecha(){};
}

class ContaFisica extends Conta{
    String cpf;
    void fecha(){};
}

public class TestTypesReference {
    public static void main(String... args){
        Conta c = new ContaJuridica();
        c.id = 15;
        c.liga();

        //c.cnpj - "5000";
        new ContaJuridica().cnpj = "15";

        //ContaJuridica d = c;

        List lista = new ArrayList();
    }
}
