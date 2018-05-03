package array.leason.five;

import java.util.ArrayList;
import java.util.Iterator;

class Client {
    String name;
}

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("java");
        names.add("ruby");
        names.add("scala");

        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            String actual = it.next();
            System.out.println(actual);
            //it.remove();//remove os elements reference
        }
        System.out.println(names.size());

        for (String name : names){
            System.out.println(name);
        }


        Client art = new Client();
        art.name = "Arthur";

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(art);

        System.out.println(art.name);
        System.out.println(clients.get(0).name);

        art.name = "Fritz";

        System.out.println(art.name);
        System.out.println(clients.get(0).name);




    }
}
