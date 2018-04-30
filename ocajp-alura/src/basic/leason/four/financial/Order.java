package basic.leason.four.financial;

import basic.leason.four.Product;
import basic.leason.four.model.*;
//import basic.leason.four.model.People;
//import basic.leason.four.model.Address;
// Class in package don't access Class in package default
//import static basic.leason.four.model.Util.TAMANHO;
//import static basic.leason.four.model.Util.maior;
import static basic.leason.four.model.Util.*;
import java.sql.Date;


class Order {
    //basic.leason.four.model.People client;
    People client;
    Address address;
    //Date dateCreated = new java.util.Date(); Especific importation
    Date dateCreated;
    java.util.Date dateFinale;
    Product product;

    public People getClient(){
        return client;
    }

    public Address getAddress(){
        return address;
    }

    public void calculaTudo(){
        int t = TAMANHO;
        maior(3,10);
    }
}
