package i.leason.four.financial;

import i.leason.four.Product;
import i.leason.four.model.*;
//import i.leason.four.model.People;
//import i.leason.four.model.Address;
// Class in package don't access Class in package default
import java.util.*;
//import static i.leason.four.model.Util.TAMANHO;
//import static i.leason.four.model.Util.maior;
import static i.leason.four.model.Util.*;
import java.sql.Date;


class Order {
    //i.leason.four.model.People client;
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
