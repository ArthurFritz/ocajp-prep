package relationship.leason.three.model;

import relationship.leason.three.financeiro.ContaFinanceira;

public class TestConta {
    public static void main(String args[]){
        Conta c = new ContaFinanceira();
        c.fecha();

        ContaFinanceira c1 = new ContaFinanceira();
        //c1.fecha(); type package, not visible

    }
}
